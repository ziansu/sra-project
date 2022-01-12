@java.lang.Override
public void onClick(android.view.View v) {
    com.nrct.application.model.User user = new com.nrct.application.model.User();
    user.removeAll();
    com.facebook.Session session = com.facebook.Session.getActiveSession();
    if (session != null) {
        session.closeAndClearTokenInformation();
        this.finish();
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.nrct.application.main.RightMenuActivity.class);
        startActivity(intent);
        finish();
    }
}