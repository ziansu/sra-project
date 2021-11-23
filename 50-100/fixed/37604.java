private java.lang.String convertDayToEnglish(java.lang.String day) {
    for (int i = 0; i < (localizedDays.length); i++) {
        if ((day.equals(localizedDays[i])) || (day.equals(usDays[i])))
            return usDays[i];
        
    }
    return "";
}