private void menuSettings() {
    android.content.SharedPreferences sp = activity.getSharedPreferences(PuzzleActivity.NAME, Context.MODE_PRIVATE);
    android.util.Log.w(net.ddns.raylam.sliding_puzzle.ui.overflow.ActionBarOverflow.NAME, ((("soundEnabled = " + (sp.getBoolean(PuzzleActivity.NAME_SOUND_ENABLED, true))) + ", difficulty = ") + (sp.getInt(PuzzleActivity.NAME_DIFFICULTY, (-1)))));
    activity.getFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).add(new net.ddns.raylam.sliding_puzzle.ui.overflow.SettingsDialog(), SettingsDialog.NAME).commit();
}