private void saveImportedSurvey(org.hwyl.sexytopo.model.survey.Survey survey, java.io.File file) throws java.lang.Exception {
    survey.checkActiveStation();
    org.hwyl.sexytopo.control.io.basic.Saver.save(survey);
    org.hwyl.sexytopo.control.io.translation.ImportManager.saveACopyOfSourceInput(survey, file);
    org.hwyl.sexytopo.control.SurveyManager.getInstance(this).setCurrentSurvey(survey);
    showSimpleToast(("Imported " + (survey.getName())));
}