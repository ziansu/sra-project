public void removeSound(int position) {
    de.meonwax.soundboard.sound.Sound sound = sounds.remove(position);
    soundAdapter.notifyDataSetChanged();
    soundPool.unload(sound.getId());
    java.lang.String externalPath = de.meonwax.soundboard.file.FileUtils.getExternalPath(this, new java.io.File(sound.getName()));
    if ((externalPath == null) || (!(new java.io.File(externalPath).delete()))) {
        android.widget.Toast.makeText(this, getString(R.string.error_remove), Toast.LENGTH_LONG).show();
    }
}