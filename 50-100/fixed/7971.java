public void writeData(java.lang.String data) {
    android.content.SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
    java.lang.String contents = sharedPref.getString(day, "");
    if (!(contents.equals(""))) {
        contents += "\n";
    }
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(day, (contents + (data.substring(0, ((data.length()) - 13)))));
    editor.commit();
}