private void distanceButtonClicked() {
    distanceButton.setBackgroundColor(getResources().getColor(R.color.button_material_dark));
    durationButton.setBackgroundColor(getResources().getColor(R.color.button_material_light));
    durationButton.setChecked(false);
    distanceButton.setChecked(true);
    durationPickerLayout.setVisibility(View.INVISIBLE);
    distancePickerLayout.setVisibility(View.VISIBLE);
}