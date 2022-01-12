private boolean competitionFinalizada(an.dpr.cyclingresultsapi.domain.Competition comp) {
    try {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(an.dpr.cyclingresultsapi.util.DateUtil.dateWithoutHour(comp.getFinishDate()));
        cal.add(java.util.Calendar.DAY_OF_YEAR, 1);
        java.util.Date finishDate = cal.getTime();
        return !(finishDate.after(new java.util.Date()));
    } catch (java.text.ParseException e) {
        an.dpr.cyclingresultsapi.services.rest.CompetitionRS.log.error("Error calculando fecha", e);
        return false;
    }
}