public boolean inDateRange(main.Date requestedDate) throws java.text.ParseException {
    main.Date currentDate = new main.Date();
    main.Date inMaxDaysFromCurrentDate = new main.Date();
    inMaxDaysFromCurrentDate.addDays(main.CalendarAuctionCentral.MAX_DAYS_OUT);
    return (currentDate.before(requestedDate)) && (!(inMaxDaysFromCurrentDate.before(requestedDate)));
}