public boolean isKeyPressed(int keycode) {
    return this.charCallback.isEnabled() ? false : this.keyCallback.isKeyPressed(keycode);
}