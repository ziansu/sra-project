public boolean isAdherenceCapturedForAnyWeek(java.lang.String patientDocId, java.lang.String treatmentAdviceId, org.joda.time.LocalDate weekStartDate) {
    return (allWeeklyAdherenceLogs.findLogsByWeekStartDate(patientDocId, treatmentAdviceId, weekStartDate).size()) > 0;
}