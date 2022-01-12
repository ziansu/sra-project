private long calculateIntervall(long given) {
    if ((mIntervallType.getSelectedItemPosition()) == 0) {
        return given * (org.kore.kolabnotes.android.security.AuthenticatorActivity.SECONDS_PER_MINUTE);
    }else
        if ((mIntervallType.getSelectedItemPosition()) == 0) {
            return (given * (org.kore.kolabnotes.android.security.AuthenticatorActivity.MINUTES_PER_HOUR)) * (org.kore.kolabnotes.android.security.AuthenticatorActivity.SECONDS_PER_MINUTE);
        }
    
    return ((given * (org.kore.kolabnotes.android.security.AuthenticatorActivity.HOURS_PER_DAY)) * (org.kore.kolabnotes.android.security.AuthenticatorActivity.MINUTES_PER_HOUR)) * (org.kore.kolabnotes.android.security.AuthenticatorActivity.SECONDS_PER_MINUTE);
}