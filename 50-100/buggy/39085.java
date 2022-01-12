public static void main(java.lang.String[] args) {
    org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
    sociam.pybossa.ProjectCreator.logger.info((("ProjectCreator will be repeated every " + (sociam.pybossa.config.Config.ProjectCreatorTrigger)) + " ms"));
    try {
        while (true) {
            sociam.pybossa.ProjectCreator.run();
            sociam.pybossa.ProjectCreator.logger.info((("Sleeping for " + (sociam.pybossa.config.Config.ProjectCreatorTrigger)) + " ms"));
            java.lang.Thread.sleep(java.lang.Integer.valueOf(Config.ProjectCreatorTrigger));
        } 
    } catch (java.lang.InterruptedException e) {
        sociam.pybossa.ProjectCreator.logger.error(("Error " + e));
    }
}