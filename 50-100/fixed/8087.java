@java.lang.Override
public void processResults(org.json.JSONObject result) {
    int minutes = getTime(result);
    if (minutes <= (oter.getTime())) {
        com.joebruzek.oter.utilities.SmsSender.sendText(oter);
        oterLayer.removeOter(oter);
    }else {
        com.joebruzek.oter.utilities.AlarmScheduler.scheduleWakeUp(this, oter, (minutes - (oter.getTime())));
    }
    this.stopSelf();
}