private void addFutureMonths(int numberOfMonths) {
    calendar.Month month = months.get(((months.size()) - 1));
    java.time.LocalDate date = month.getDay(1).getDay();
    for (int i = 1; i <= numberOfMonths; i++) {
        months.add(new calendar.Month(date.plusMonths(i)));
    }
}