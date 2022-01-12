private void enablePressureAxis(java.lang.Boolean on) {
    if (!on) {
        if ((!(sysSwitch.isChecked())) && (!(diaSwitch.isChecked()))) {
            mmHgDescription.setVisibility(View.INVISIBLE);
        }
    }else {
        mmHgDescription.setVisibility(View.VISIBLE);
    }
}