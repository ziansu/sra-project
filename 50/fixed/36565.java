public void addSurvey(org.eyeseetea.malariacare.data.database.model.Survey survey) {
    if ((rowBuilders) != null) {
        for (org.eyeseetea.malariacare.presentation.factory.monitor.MonitorRowBuilder rowBuilder : rowBuilders) {
            rowBuilder.addSurvey(survey);
        }
    }
}