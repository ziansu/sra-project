public void useRingtoneState(android.content.Context context) {
    if (shouldBeAlarmStartedNow()) {
        timeEvent = new com.wordpress.gatarblog.dzwonnik.States.RingtoneState.TimeEvent(context);
        timeEvent.start();
        java.lang.String toastMessage = (((hour) + ":") + ((minute) < 10 ? "0" + (minute) : minute)) + " \ud83d\udd50";
        java.lang.System.out.println(toastMessage);
        android.widget.Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}