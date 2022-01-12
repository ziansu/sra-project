@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String lastupdatedate = getLastDateSent();
    try {
        if ((isCorrectAfternoonMeassurament()) && (isCorrectMorningMeassurament())) {
            new com.android.bpcontrol.fragments.PressuresFragment.sendPressures().execute();
        }else {
            showDialog(getResources().getString(R.string.messagesend));
        }
    } catch (java.lang.Exception ex) {
        com.android.bpcontrol.utils.LogBP.printStackTrace(ex);
    }
}