public static void main(java.lang.String[] args) {
    com.org.gnos.test.TestApplication application = new com.org.gnos.test.TestApplication();
    com.org.gnos.core.GNOSConfig.load();
    com.org.gnos.core.ProjectConfigutration.getInstance().load(1);
    com.org.gnos.core.ScenarioConfigutration.getInstance().load(1);
    com.org.gnos.services.EquationGeneratorService.getInstance().execute();
}