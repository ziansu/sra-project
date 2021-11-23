protected java.lang.Integer getEndWeek(com.nectp.jpa.entities.Season currentSeason, com.nectp.jpa.constants.NEC recordType) {
    java.lang.Integer endWeek = null;
    if ((((recordType == (com.nectp.jpa.constants.NEC.FIRST_HALF)) || (recordType == (com.nectp.jpa.constants.NEC.SECOND_HALF))) || (recordType == (com.nectp.jpa.constants.NEC.PLAYOFFS))) || (recordType == (com.nectp.jpa.constants.NEC.SUPER_BOWL))) {
        endWeek = getEndWeekForType(currentSeason, recordType);
    }
    if (endWeek == null) {
        com.nectp.jpa.entities.Week currentWeek = currentSeason.getCurrentWeek();
        endWeek = currentWeek.getWeekNumber();
    }
    return endWeek;
}