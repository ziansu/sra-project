@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.nrct.application.main.NrctMainActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.open_main, R.anim.close_next);
    finish();
}