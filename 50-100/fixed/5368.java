public static void quit() {
    nodomain.freeyourgadget.gadgetbridge.util.GB.log("Quitting Gadgetbridge...", GB.INFO, null);
    android.content.Intent quitIntent = new android.content.Intent(nodomain.freeyourgadget.gadgetbridge.GBApplication.ACTION_QUIT);
    android.support.v4.content.LocalBroadcastManager.getInstance(nodomain.freeyourgadget.gadgetbridge.GBApplication.context).sendBroadcast(quitIntent);
    nodomain.freeyourgadget.gadgetbridge.GBApplication.deviceService().quit();
}