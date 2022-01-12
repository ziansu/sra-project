private void listAuctions(refactored.DisplayCalendar cal) {
    java.lang.System.out.println("Choose an auction. ");
    java.util.List<refactored.Auction> upcomingAuc = cal.getUpcomingAuctions();
    for (int i = 0; i < (upcomingAuc.size()); i++) {
        java.lang.System.out.println((((i + 1) + ") ") + (upcomingAuc.get(i))));
    }
}