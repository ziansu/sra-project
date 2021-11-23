public static void saveBass() {
    if ((com.rks.musicx.data.Eq.BassBoosts.bassBoost) == null) {
        return ;
    }
    android.content.SharedPreferences.Editor editor = com.rks.musicx.misc.utils.Extras.getInstance().saveEq().edit();
    editor.putBoolean(com.rks.musicx.misc.utils.Constants.BASS_ENABLED, com.rks.musicx.data.Eq.BassBoosts.bassBoost.getEnabled());
    editor.putInt(com.rks.musicx.misc.utils.Constants.BASS_BOOST, com.rks.musicx.data.Eq.BassBoosts.getStr());
    editor.apply();
}