public void toggleEdit() {
    editable = !(editable);
    android.view.MenuItem item = ((android.view.MenuItem) (menu.findItem(R.id.action_add)));
    item.setVisible(editable);
    if ((data) == null)
        return ;
    
    for (com.munger.budgettrack.model.CashFlow tr : data) {
        com.munger.budgettrack.view.CashFlowBase.IncomeViewStruct view = viewIndex.get(tr.id);
        view.setEditable(editable);
    }
    list.invalidate();
}