public void onUsageSelected(int usageId) {
    com.example.user.financemgmt.DataModel.Usage usage = null;
    if (usageId != (-1)) {
        usage = com.example.user.financemgmt.DAO.DriverDao.getCategoryUsageList().get(usageId);
        this.usage = usage;
    }else
        this.usage = null;
    
    if (isReadyToMakeExpense()) {
        view.get().showExpenseDialog(source.getName(), usage.getName(), this);
    }
}