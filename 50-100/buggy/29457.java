public void saveVolumeMode(java.lang.String modeName) {
    for (int i = 0; i < (mVolMember.size()); i++) {
        android.util.Log.d(com.app.kent.volume.Main.TAG, ("saveVolumeMode - i = " + (mVolMember.get(i).getCurrent(i))));
        settings.edit().putInt(((("[" + modeName) + "]") + i), mVolMember.get(i).getCurrent(i)).apply();
    }
}