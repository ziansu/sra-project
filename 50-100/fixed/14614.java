private void addNewPeriodIfNeeded(java.util.List<main.model.Period> periods) {
    org.joda.time.DateTime currentDate = new org.joda.time.DateTime();
    if ((periods.size()) == 0) {
        periods.add(new main.model.Period(currentDate));
    }else {
        main.model.Period previous = periods.get(0);
        while (previous.getStartDate().isBefore(currentDate)) {
            previous = previous.createNextPeriod();
        } 
        periods.add(previous);
    }
}