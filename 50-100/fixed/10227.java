public int getNumberOfWorkingDays() {
    java.util.List<java.lang.String> distinctPeriods = new java.util.ArrayList<>();
    for (com.jpa.entities.Period period : getAllPeriods()) {
        if (!(distinctPeriods.contains(period.getDay()))) {
            distinctPeriods.add(period.getDay());
        }
    }
    return distinctPeriods.size();
}