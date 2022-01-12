private void addNewPeriodIfNeeded(java.util.List<main.model.Period> periods) {
    org.joda.time.DateTime currentDate = new org.joda.time.DateTime();
    if ((periods.size()) == 0) {
        periods.add(new main.model.Period(currentDate));
    }else {
        main.model.Period previous = periods.get(0);
        if (previous.getStartDate().isBefore(currentDate)) {
            periods.add(0, previous.createNextPeriod());
        }
    }
}