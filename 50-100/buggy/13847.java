@java.lang.Override
public void onTick(long l) {
    com.ecml.ActivityParameters a = com.ecml.ReadWriteXMLFile.readActivityByNumber(number, context);
    if (a != null) {
        a.setCountdown(((int) (l)));
        com.ecml.ReadWriteXMLFile.edit(a, context);
        java.lang.Long l1 = java.lang.Long.valueOf(l);
        l1 = l1 / 1000;
        android.util.Log.d("Countdown", l1.toString());
    }
}