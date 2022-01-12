@java.lang.Override
public void onNext(will.tw.airquality.air.model.AirReport airReport) {
    java.util.ArrayList<will.tw.airquality.air.model.Record> airreports = airReport.getResult().getRecords();
    java.lang.String text;
    text = airreports.get(0).getSiteName();
    android.util.Log.e("countory Service", text);
    will.tw.airquality.AirService.mAirReport = airreports;
    new will.tw.airquality.AirService.MyServerThread().start();
    stopSelf();
}