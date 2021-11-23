@org.isoron.uhabits.utils.Nullable
public static java.lang.String getRingtoneName(org.isoron.uhabits.utils.Context context) {
    try {
        org.isoron.uhabits.utils.Uri ringtoneUri = org.isoron.uhabits.utils.RingtoneUtils.getRingtoneUri(context);
        java.lang.String ringtoneName = context.getResources().getString(R.string.none);
        if (ringtoneUri != null) {
            org.isoron.uhabits.utils.Ringtone ringtone = org.isoron.uhabits.utils.RingtoneManager.getRingtone(context, ringtoneUri);
            if (ringtone != null) {
                ringtoneName = ringtone.getTitle(context);
                ringtone.stop();
            }
        }
        return ringtoneName;
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
        return null;
    }
}