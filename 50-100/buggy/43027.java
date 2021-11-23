public void callbackSuccess() {
    android.content.SharedPreferences.Editor editor = getSharedPreferences(com.epfl.dedis.cisc.PREF, Context.MODE_PRIVATE).edit();
    editor.putString(com.epfl.dedis.cisc.IDENTITY, com.epfl.dedis.crypto.Utils.toJson(createIdentity.getIdentity()));
    editor.apply();
    android.content.Intent i = new android.content.Intent(this, com.epfl.dedis.cisc.ConfigActivity.class);
    startActivity(i);
    this.finish();
}