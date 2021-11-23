private void setNightModeIcon() {
    if (((settings.nightModeActivationMode) == (com.firebirdberlin.nightdream.Settings.NIGHT_MODE_ACTIVATION_MANUAL)) || ((com.firebirdberlin.nightdream.Utility.getLightSensor(mContext)) == null)) {
        nightModeIcon.setVisibility(View.VISIBLE);
    }else {
        nightModeIcon.setVisibility(View.GONE);
    }
    nightModeIcon.setImageResource(((mode) == 0 ? R.drawable.ic_moon : R.drawable.ic_sun));
}