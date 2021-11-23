@java.lang.Override
protected void startAlarm() {
    if (chisw.com.dayit.utils.ValidData.isTextValid(mTextContact.getText().toString())) {
        try {
            sendRemotePlan();
            writePlanToDB(mMyLovelyCalendar);
        } catch (java.lang.Exception ex) {
            return ;
        }
        super.startAlarm();
    }else {
        showToast("Please, choose a contact person");
    }
}