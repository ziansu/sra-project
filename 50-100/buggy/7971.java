public void writeData(java.lang.String data) {
    android.content.SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
    java.lang.String contents = sharedPref.getString(day, "");
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(day, ((contents + "\n") + (data.substring(0, ((data.length()) - 13)))));
    editor.commit();
}