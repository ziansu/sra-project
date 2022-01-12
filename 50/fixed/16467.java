public void save(boolean block) {
    this.saved = true;
    this.blocked = block;
    mlga.io.Preferences.set(this.id, block);
}