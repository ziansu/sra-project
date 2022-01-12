private double calculateMeanExpensePerCategory(bp.model.CategoryType category, java.time.LocalDate date) {
    double sum = 0.0;
    double n = 0.0;
    for (java.time.LocalDate tmp = summaryRepository.getMinDate(); tmp.isBefore(date); tmp.plusMonths(1)) {
        bp.model.Summary summary = summaryRepository.getById(tmp);
        if (summary != null) {
            sum += summary.getCategoryExpensesMap().get(category).getExpenses();
            n++;
        }
    }
    return sum / n;
}