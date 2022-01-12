public int getKeyboardViewResourceId(boolean e) {
    java.lang.String file = (e) ? (language) + "_extended_consonants" : language;
    file = file + (displayMode);
    android.util.Log.d("layout", ("filename = " + file));
    return getResources().getIdentifier(file, "xml", getPackageName());
}