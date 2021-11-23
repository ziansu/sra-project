private boolean checkLog() {
    android.content.SharedPreferences pref = getSharedPreferences(com.epfl.dedis.cisc.LOG, Context.MODE_PRIVATE);
    host = pref.getString(com.epfl.dedis.cisc.HOST, "");
    port = pref.getString(com.epfl.dedis.cisc.PORT, "");
    id = pref.getString(com.epfl.dedis.cisc.ID, "");
    mIdentityValue.setText(id);
    return (host.isEmpty()) || (port.isEmpty());
}