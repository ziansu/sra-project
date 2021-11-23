private void updateUI(boolean isAvailable) {
    availabilitySwitch.setClickable(true);
    availabilitySwitch.setChecked(isAvailable);
    if (isAvailable) {
        availabilityText.setText(getString(R.string.available));
    }else {
        availabilityText.setText(getString(R.string.unavailable));
    }
}