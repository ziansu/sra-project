@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(FirebaseAnalytics.Param.ITEM_ID, getString(R.string.sign_out));
    bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, getString(R.string.sign_out));
    bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "button");
    mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    startActivity(new android.content.Intent(context, com.conz13.d.strongpasswordcreator.LoginActivity.class));
    finish();
}