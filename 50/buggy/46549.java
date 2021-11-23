private void importBankAccountData(java.lang.String filename) {
    com.mweser.affordabilitytracker.model.java_app.utils.structures.Data bankAccountData;
    for (com.mweser.affordabilitytracker.model.java_app.utils.structures.DataRow row : bankAccountData) {
        bankAccountList.add(new com.mweser.affordabilitytracker.model.java_app.projection.recurring_events.BankAccount(row, globalStartDate, globalEndDate));
    }
}