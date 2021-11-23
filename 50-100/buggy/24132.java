public void updateProperties(java.lang.String scenarioName) throws java.io.FileNotFoundException, java.io.IOException {
    java.util.Properties properties = new java.util.Properties();
    properties.load(new java.io.FileReader(new java.io.File("conf/tester.properties")));
    properties.setProperty("BaseTemplateScenarioName", scenarioName);
    properties.setProperty("ScenarioInputFile", (scenarioName + ".csv"));
    properties.setProperty("StartIndex", ("" + (index)));
    java.io.FileOutputStream out = new java.io.FileOutputStream("conf/tester.properties");
    properties.store(out, null);
    out.close();
}