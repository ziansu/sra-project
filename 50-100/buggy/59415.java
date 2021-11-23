@java.lang.Override
public void msgError(int num) {
    android.util.Log.e(TAG, ("error, " + num));
    android.content.Intent intentResult = new android.content.Intent();
    intentResult.putExtra("error", num);
    intentResult.putExtra("action", action);
    setResult(co.vitallabs.plugin.RESULT_CANCELLED, intentResult);
    android.util.Log.i(TAG, "Back from unsuccesfull measure ");
    finish();
}