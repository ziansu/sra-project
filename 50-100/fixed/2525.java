private budget.Budget getAmonut(java.time.LocalDate date) {
    java.util.List<budget.Budget> all = budgetRepo.findAll();
    for (budget.Budget budget : all) {
        java.lang.String yearmonth = ((date.getYear()) + "") + (java.lang.String.format("%02d", date.getMonth().getValue()));
        if (budget.getMonth().equals(yearmonth)) {
            return budget;
        }
    }
    return null;
}