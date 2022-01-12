@java.lang.Override
public void onIabSetupFinished(com.SoftwareOverflow.CookingScheduler.util.IabResult result) {
    android.util.Log.d("db", ("setupFinished, result good: " + (result.isSuccess())));
    if ((result.isSuccess()) && ((mHelper) != null)) {
        queryInventory();
    }else {
        android.widget.Toast.makeText(context.getApplicationContext(), "ERROR!", Toast.LENGTH_LONG).show();
    }
}