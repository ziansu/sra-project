private void updateUI(boolean isAvailable) {
    availabilitySwitch.setClickable(true);
    availabilitySwitch.setChecked(isAvailable);
    if (isAvailable) {
        availabilityText.setText(getString(R.string.available));
        availabilityText.setTextColor(Color.GREEN);
    }else {
        availabilityText.setText(getString(R.string.unavailable));
        availabilityText.setTextColor(Color.RED);
    }
}