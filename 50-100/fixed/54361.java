public void stopSound(java.lang.String title) {
    java.lang.Integer id = this.loadedSounds.get(title);
    this.soundPool.stop(id.intValue());
    this.soundPool.unload(id.intValue());
    this.loadedSounds.remove(title);
}