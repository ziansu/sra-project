protected void onPostExecute(java.lang.String Result) {
    if ((received_num.length()) > 0) {
        phone.setText(received_num);
        android.content.SharedPreferences saved_values = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        android.content.SharedPreferences.Editor editor = saved_values.edit();
        editor.putString("phone", received_num);
        editor.apply();
    }
}