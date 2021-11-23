public boolean isAdherenceCapturedForAnyWeek(java.lang.String patientDocId, java.lang.String treatmentAdviceId, org.joda.time.LocalDate weekStartDate) {
    return 1 == (allWeeklyAdherenceLogs.findLogsByWeekStartDate(patientDocId, treatmentAdviceId, weekStartDate).size());
}