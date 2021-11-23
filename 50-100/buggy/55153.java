@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("pref_alt", true)) {
        android.os.Vibrator vi = ((android.os.Vibrator) (getActivity().getSystemService(MainActivity.VIBRATOR_SERVICE)));
        vi.vibrate(10);
    }
    if (!(doubleTap)) {
        tvAlt.setText(de.tap.easy_xkcd.ComicBrowserFragment.sComicMap.get(de.tap.easy_xkcd.ComicBrowserFragment.sLastComicNumber).getComicData()[1]);
        toggleVisibility(tvAlt);
    }
    return true;
}