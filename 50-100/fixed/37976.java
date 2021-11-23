@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public void changeValues(java.lang.Long amount) {
    long adding = amount * (subtracting);
    if (isSettingGoal) {
        java.lang.Long changing = punchCardInterface.getCurrent().getCard().getGoal();
        if ((changing + adding) >= 0) {
            punchCardInterface.getCurrent().getCard().setGoal((changing + adding));
        }
    }else {
        punchCardInterface.getCurrent().getCard().addUserBuffer(adding);
    }
    updateUI();
}