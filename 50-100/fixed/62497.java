public java.lang.String getValueAsString(int i) {
    if (i == 0)
        return getContext().getString(R.string.off);
    
    return java.lang.String.format("%.3f%s - %d", ((ch.bailu.aat.preferences.SolidAutopause.SPEED_VALUES[i]) * (sunit.getSpeedFactor())), sunit.getSpeedUnit(), ch.bailu.aat.preferences.SolidAutopause.TRIGGER_VALUES[i]);
}