protected java.lang.Integer getStartWeekByType(com.nectp.jpa.entities.Season currentSeason, com.nectp.jpa.constants.NEC recordType) {
    java.lang.Integer startWeek;
    if (recordType != null) {
        switch (recordType) {
            case SECOND_HALF :
                startWeek = currentSeason.getSecondHalfStartWeek();
                break;
            case PLAYOFFS :
                startWeek = currentSeason.getPlayoffStartWeek();
                break;
            case SUPER_BOWL :
                startWeek = currentSeason.getSuperbowlWeek();
                break;
            default :
                startWeek = 1;
                break;
        }
    }else
        startWeek = 1;
    
    return startWeek;
}