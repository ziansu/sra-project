@java.lang.Override
protected void onPostExecute(java.lang.Integer integer) {
    super.onPostExecute(integer);
    edu.gcc.whiletrue.pingit.SecurePreferences preferences = new edu.gcc.whiletrue.pingit.SecurePreferences(getContext(), getString(R.string.pref_login), edu.gcc.whiletrue.pingit.SecurePreferences.generateDeviceUUID(getContext()), true);
    preferences.clear();
    android.content.Intent intent = new android.content.Intent(fragmentContext, edu.gcc.whiletrue.pingit.StartupActivity.class);
    intent.putExtra("startFragment", 1);
    startActivity(intent);
    android.support.v4.app.ActivityCompat.finishAffinity(getActivity());
}