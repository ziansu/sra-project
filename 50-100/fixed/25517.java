public java.lang.Boolean isNowInOffer(java.util.Calendar day) {
    if (isDayInOffer(day)) {
        int timeOfDay = day.get(java.util.Calendar.HOUR_OF_DAY);
        if ((timeOfDay >= 6) && (timeOfDay < 16)) {
            return offerAtLunch;
        }else
            if ((timeOfDay >= 16) || (timeOfDay < 6)) {
                return offerAtDinner;
            }
        
    }
    return false;
}