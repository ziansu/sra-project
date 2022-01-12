private static org.hwyl.sexytopo.model.survey.Survey parseTh(java.io.File file) throws java.lang.Exception {
    java.lang.String contents = org.hwyl.sexytopo.control.io.basic.Loader.slurpFile(file);
    java.lang.String name = org.hwyl.sexytopo.control.io.thirdparty.therion.TherionImporter.getSurveyName(file);
    org.hwyl.sexytopo.model.survey.Survey survey = new org.hwyl.sexytopo.model.survey.Survey(name);
    java.util.List<java.lang.String> lines = java.util.Arrays.asList(contents.split("\n"));
    org.hwyl.sexytopo.control.io.thirdparty.therion.TherionImporter.updateCentreline(lines, survey);
    return survey;
}