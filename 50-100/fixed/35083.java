public void installPacoBarkRingtone() {
    com.pacoapp.paco.UserPreferences userPreferences = new com.pacoapp.paco.UserPreferences(context);
    if (!(userPreferences.hasInstalledAlternateRingtone())) {
        installRingtone(userPreferences, com.pacoapp.paco.os.RingtoneUtil.ALTERNATE_RINGTONE_FILENAME, com.pacoapp.paco.os.RingtoneUtil.ALTERNATE_RINGTONE_TITLE, true);
    }
    userPreferences.setAlternateRingtoneInstalled();
    if (!(userPreferences.hasInstalledPacoBarkRingtone())) {
        installRingtone(userPreferences, com.pacoapp.paco.os.RingtoneUtil.BARK_RINGTONE_FILENAME, com.pacoapp.paco.os.RingtoneUtil.PACO_BARK_RINGTONE_TITLE, false);
    }
    userPreferences.setPacoBarkRingtoneInstalled();
}