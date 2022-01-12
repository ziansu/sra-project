private void moonstalkerMain() throws java.lang.InterruptedException {
    testButton.setOnClickListener(this);
    calibrateButton.setOnClickListener(this);
    traceButton.setOnClickListener(this);
    disableButton(traceButton);
    moveButton.setOnClickListener(this);
    disableButton(moveButton);
    connectButton.setOnClickListener(this);
    mStarAdapter = android.widget.ArrayAdapter.createFromResource(this, R.array.stars, android.R.layout.simple_spinner_item);
    mStarDropDown.setAdapter(mStarAdapter);
    mStarDropDown.setOnItemSelectedListener(this);
    mStarDropDown.setEnabled(false);
    showLocation();
    updateStatus();
}