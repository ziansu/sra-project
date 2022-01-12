@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
    progressDialog = new com.afollestad.materialdialogs.MaterialDialog.Builder(this).title(R.string.hacking_progress).content(R.string.changing_contacts).progress(false, 100, true).cancelable(false).build();
}