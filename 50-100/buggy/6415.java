@java.lang.Override
protected void onResume() {
    java.lang.String language = getResources().getConfiguration().locale.getDisplayLanguage();
    java.lang.System.out.println(("-------- Language" + language));
    if (language.equals("español")) {
        android.widget.ArrayAdapter adap = ((android.widget.ArrayAdapter) (spinner_language.getAdapter()));
        spinner_language.setSelection(adap.getPosition("Español"));
    }
    super.onResume();
}