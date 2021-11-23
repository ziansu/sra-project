private void importExpenseEventData(java.lang.String filename) {
    com.mweser.affordabilitytracker.model.java_app.utils.structures.Data expenseEventData;
    for (com.mweser.affordabilitytracker.model.java_app.utils.structures.DataRow row : expenseEventData) {
        expenseEventList.add(new com.mweser.affordabilitytracker.model.java_app.projection.recurring_events.ExpenseEvent(row, globalStartDate, globalEndDate, CREDIT_ALIGNED, bankAccountList));
    }
}