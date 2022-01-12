public static void Run() {
    try {
        Apps.BookingDotComApp.mLogger.trace("BookingDotComApp start");
        final PageGuest.BookingDotComPageGuest lGuest = ((PageGuest.BookingDotComPageGuest) (Root.PageGuestFactory.Create("booking.com")));
        lGuest.Init();
        lGuest.WaitForFinish();
        Apps.BookingDotComApp.mLogger.trace("BookingDotComApp stop");
    } catch (java.lang.Exception e) {
        Apps.BookingDotComApp.mLogger.error(("Unhandled exception: " + (Util.StringHelper.getTraceInformation(e))));
    }
}