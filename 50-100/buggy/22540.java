public void calculateTotalsPerCategory() {
    for (com.jaz.budgt.Transaction transaction : transactionList) {
        java.lang.String category = transaction.getCategory();
        if (categoryTotals.containsKey(category)) {
            categoryTotals.put(category, ((categoryTotals.get(category)) + (transaction.getAmount())));
        }
    }
}