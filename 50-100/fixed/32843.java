private refactored.Auction chooseAuction(int pickAuc, refactored.DisplayCalendar cal) {
    refactored.Auction chosenAuc = null;
    java.util.List<refactored.Auction> upcomingAuc = cal.getUpcomingAuctions();
    for (int i = 1; i <= (upcomingAuc.size()); i++) {
        if (i == pickAuc) {
            chosenAuc = upcomingAuc.get((i - 1));
            java.lang.System.out.println(chosenAuc.getAuctionName());
        }
    }
    return chosenAuc;
}