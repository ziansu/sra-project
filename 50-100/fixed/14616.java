private void enableMinusButton() {
    android.widget.Button minusButton = ((android.widget.Button) (findViewById(R.id.minus)));
    minusButton.setEnabled(true);
    minusButton.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
    minusButton.getBackground().setAlpha(255);
}