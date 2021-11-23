public static void main(java.lang.String[] args) {
    org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
    sociam.pybossa.TaskPerformer.logger.info((("TaskPerformer will be repeated every " + (sociam.pybossa.config.Config.TaskCreatorTrigger)) + " ms"));
    try {
        while (true) {
            sociam.pybossa.TaskPerformer.run();
            sociam.pybossa.TaskPerformer.logger.info((("Sleeping for " + (sociam.pybossa.config.Config.TaskPerformerTrigger)) + " ms"));
            java.lang.Thread.sleep(java.lang.Integer.valueOf(Config.TaskPerformerTrigger));
        } 
    } catch (java.lang.InterruptedException e) {
        sociam.pybossa.TaskPerformer.logger.error(("Error " + e));
    }
}