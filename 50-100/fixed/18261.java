@java.lang.Override
public void run() {
    java.lang.String astro_detail = peopleinSpace.display_people(true);
    java.lang.String astro_onfile = sharedPref.getString(getString(R.string.astro_detail), "");
    if (!(astro_detail.equals(astro_onfile))) {
        sharedPref.edit().putString(getString(R.string.astro_detail), astro_detail).apply();
        notification();
    }
}