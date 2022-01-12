public static org.hwyl.sexytopo.model.survey.Survey create(java.lang.String name, int numStations, int numBranches) {
    org.hwyl.sexytopo.model.survey.Survey survey = new org.hwyl.sexytopo.model.survey.Survey(name);
    org.hwyl.sexytopo.demo.TestSurveyCreator.createBranch(survey, numStations);
    for (int i = 0; i < numBranches; i++) {
        java.util.List<org.hwyl.sexytopo.model.survey.Station> stations = survey.getAllStations();
        org.hwyl.sexytopo.model.survey.Station active = org.hwyl.sexytopo.demo.TestSurveyCreator.getRandom(stations);
        survey.setActiveStation(active);
        org.hwyl.sexytopo.demo.TestSurveyCreator.createBranch(survey, 3);
    }
    return survey;
}