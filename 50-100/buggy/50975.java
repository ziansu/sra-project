private boolean isDisqualified(edu.colorado.csci5828.remotelypossible.dlap.model.Application a) {
    if ((java.lang.Float.parseFloat(a.getStudent().getGpa())) < 3.0F) {
        a.setScore(Application.SCORE_DISQUALIFIED);
        a.setDisqualReason("Reported GPA too low");
        return true;
    }
    if (a.getApprenticeshipInfo().getServeAllYear().equals("No")) {
        a.setScore(Application.SCORE_DISQUALIFIED);
        a.setDisqualReason("Students must be able to serve in DLA all year");
        return true;
    }
    return false;
}