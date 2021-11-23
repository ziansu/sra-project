public static boolean isMoreThanTwoDays(model.Date theAuctionDate, model.Date theCurrentDate) {
    return (((theAuctionDate.getYear()) <= (theCurrentDate.getYear())) && ((theAuctionDate.getMonthAsNumber()) <= (theCurrentDate.getMonthAsNumber()))) && ((theCurrentDate.getDay()) <= ((theAuctionDate.getDay()) - (model.Calendar.DAYS_BEFORE)));
}