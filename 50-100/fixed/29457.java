public void saveVolumeMode(java.lang.String modeName) {
    for (int i = 0; i < (mVolMember.size()); i++) {
        settings.edit().putInt(((("[" + modeName) + "]") + i), mVolMember.get(i).getCurrent(i)).apply();
    }
}