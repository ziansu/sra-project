@java.lang.Override
public void run() {
    db.addReading(new database.Reading(java.lang.System.currentTimeMillis(), application.processingService.getAcc1X(), application.processingService.getAcc1Y(), application.processingService.getAcc1Z(), application.processingService.getAcc2X(), application.processingService.getAcc2Y(), application.processingService.getAcc2Z(), app.edi.palmprothesismotionmonitoring.MainActivity.actionType, 1));
}