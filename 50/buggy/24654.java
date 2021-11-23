public void checkedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    switch (buttonView.getId()) {
        case R.id.imperialMetricSwitch :
            setUseImperial(isChecked);
            break;
        case R.id.aebSwitch :
            setAebPhotoMode(isChecked);
    }
    if (isChecked) {
    }else {
    }
}