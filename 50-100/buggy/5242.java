@java.lang.Override
protected void startAlarm() {
    if (chisw.com.dayit.utils.ValidData.isTextValid(mTextContact.getText().toString())) {
        try {
            writePlanToDB(mMyLovelyCalendar);
            sendRemotePlan();
        } catch (java.lang.Exception ex) {
            return ;
        }
        super.startAlarm();
    }else {
        showToast("Please, choose a contact person");
    }
}