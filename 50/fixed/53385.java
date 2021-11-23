private void initButtonRow() {
    mColor = getResources().getIntArray(R.array.pickerColors)[0];
    btnColor = ((android.widget.ImageButton) (findViewById(R.id.btnPickColor)));
    btnVibrate = ((android.widget.ToggleButton) (findViewById(R.id.btnToggleVibration)));
}