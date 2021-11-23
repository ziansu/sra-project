@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent();
    setResult(RESULT_NEXT, i);
    overridePendingTransition(0, 0);
    finish();
    java.lang.System.out.println("onBackPressed1");
    overridePendingTransition(0, 0);
}