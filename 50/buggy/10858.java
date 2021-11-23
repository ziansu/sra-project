@java.lang.Override
public void onDestroy() {
    com.kaltura.playkit.plugins.KalturaStatsPlugin.log.d("onDestroy");
    intervalOn = false;
    timer.cancel();
}