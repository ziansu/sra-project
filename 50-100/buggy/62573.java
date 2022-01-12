private void sendRequest(net.exclaimindustries.geohashdroid.util.Graticule g) {
    java.util.Calendar cal = getMostRecentStockDate(null);
    android.content.Intent request = new android.content.Intent(this, net.exclaimindustries.geohashdroid.services.StockService.class);
    request.setAction(StockService.ACTION_STOCK_REQUEST).putExtra(StockService.EXTRA_GRATICULE, g).putExtra(StockService.EXTRA_DATE, cal).putExtra(StockService.EXTRA_REQUEST_ID, ((int) ((cal.getTimeInMillis()) / 1000))).putExtra(StockService.EXTRA_REQUEST_FLAGS, StockService.FLAG_ALARM);
    showNotification(net.exclaimindustries.geohashdroid.util.Info.makeAdjustedCalendar(cal, g));
    com.commonsware.cwac.wakeful.WakefulIntentService.sendWakefulWork(this, request);
}