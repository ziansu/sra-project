private void UpdateForcePicker(boolean enabled, android.view.ViewGroup vg) {
    android.widget.NumberPicker np = ((android.widget.NumberPicker) (vg.findViewById(R.id.npSpriteRating)));
    np.setEnabled(enabled);
    np.setClickable(enabled);
    np.setValue(data.getCurrentSprite().getRating());
    np.setMaxValue(((data.pvResonance) * 2));
}