public int getPulseOutDuration() {
    if (getOverwriteValue()) {
        return Settings.System.getIntForUser(mContext.getContentResolver(), Settings.System.DOZE_PULSE_DURATION_OUT, R.integer.doze_pulse_duration_out, UserHandle.USER_CURRENT);
    }
    return getInt("doze.pulse.duration.out", R.integer.doze_pulse_duration_out);
}