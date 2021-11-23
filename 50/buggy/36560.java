public void disable() {
    android.util.Log.d("Reverb", "Disabled Reverb effect");
    if ((effect) != null) {
        effect.setEnabled(false);
    }
    isActive = false;
}