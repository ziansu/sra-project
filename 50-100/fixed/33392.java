public void saveSurveyStatus() {
    for (int i = 0; i < (surveys.size()); i++) {
        org.eyeseetea.malariacare.database.model.Survey iSurvey = surveys.get(i);
        org.hisp.dhis.android.sdk.persistence.models.Event iEvent = events.get(i);
        iSurvey.saveMainScore();
        iSurvey.save();
        iEvent.setFromServer(true);
        iEvent.save();
    }
}