@java.lang.Override
protected void onStart() {
    super.onStart();
    com.facebook.Session.getActiveSession().addCallback(this);
}