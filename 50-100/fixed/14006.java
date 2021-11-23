private void enablePressureAxis(java.lang.Boolean on) {
    if (on) {
        mmHgDescription.setVisibility(View.VISIBLE);
    }else {
        if ((!(sysSwitch.isChecked())) && (!(diaSwitch.isChecked()))) {
            mmHgDescription.setVisibility(View.INVISIBLE);
        }
    }
}