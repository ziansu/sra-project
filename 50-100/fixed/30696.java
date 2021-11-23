public static void saveBass() {
    if ((com.rks.musicx.data.Eq.BassBoosts.bassBoost) == null) {
        return ;
    }
    android.content.SharedPreferences.Editor editor = com.rks.musicx.misc.utils.Extras.getInstance().saveEq().edit();
    editor.putBoolean(com.rks.musicx.misc.utils.Constants.BASS_ENABLED, com.rks.musicx.data.Eq.BassBoosts.bassBoost.getEnabled());
    short str = ((com.rks.musicx.data.Eq.BassBoosts.getStr()) == 0) ? 0 : com.rks.musicx.data.Eq.BassBoosts.getStr();
    editor.putInt(com.rks.musicx.misc.utils.Constants.BASS_BOOST, str);
    editor.apply();
}