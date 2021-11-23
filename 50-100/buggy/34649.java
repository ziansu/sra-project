public static boolean isMoreThanTwoDays(model.Date theAuctionDate, model.Date theCurrentDate) {
    return (((theAuctionDate.getYear()) <= (theCurrentDate.getYear())) && ((theAuctionDate.getMonthAsNumber()) <= (theCurrentDate.getMonthAsNumber()))) && ((theAuctionDate.getDay()) <= ((theCurrentDate.getDay()) - (model.Calendar.DAYS_BEFORE)));
}