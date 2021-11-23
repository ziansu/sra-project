@java.lang.Override
protected void onResume() {
    super.onResume();
    final android.content.SharedPreferences sharedPref = getSharedPreferences(io.github.scola.qart.MainActivity.PREF_GUIDE_VERSION, Context.MODE_PRIVATE);
    java.lang.String version = sharedPref.getString(io.github.scola.qart.MainActivity.PREF_GUIDE_VERSION, "");
    if (!(version.equals(io.github.scola.qart.MainActivity.getMyVersion(this)))) {
        android.content.Intent i = new android.content.Intent(this, io.github.scola.qart.IntroActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}