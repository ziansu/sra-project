public void enable() {
    android.util.Log.d("Reverb", "Enabled Reverb effect");
    if ((effect) != null) {
        effect.setEnabled(true);
    }
    isActive = true;
}