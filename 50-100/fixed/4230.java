public void durationButtonClicked() {
    durationButton.setBackgroundColor(getResources().getColor(R.color.button_material_dark));
    distanceButton.setBackgroundColor(getResources().getColor(R.color.button_material_light));
    distanceButton.setChecked(false);
    durationButton.setChecked(true);
    durationPickerLayout.setVisibility(View.VISIBLE);
    distancePickerLayout.setVisibility(View.INVISIBLE);
}