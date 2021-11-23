protected void onPostExecute(java.lang.String Result) {
    if (((received_addr) != null) && ((received_addr.length()) > 0)) {
        java.lang.System.out.println("hiii");
        android.content.SharedPreferences saved_values = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        android.content.SharedPreferences.Editor editor = saved_values.edit();
        editor.putString("address", received_addr);
        editor.apply();
    }
}