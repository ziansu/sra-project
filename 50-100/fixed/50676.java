public bp.services.CategorySpendingStats categorySpendingStats(bp.services.CategoryType category, java.time.LocalDate dateFrom, java.time.LocalDate dateTo) {
    java.util.List<bp.services.MonthlyExpensesType> stats = new java.util.ArrayList<>();
    for (java.time.LocalDate date = dateFrom; date.isBefore(dateTo); date = date.plusMonths(1)) {
        stats.add(sumTransactionsPerMonth(date, category));
    }
    return new bp.services.CategorySpendingStats(category, dateFrom, dateTo, stats);
}