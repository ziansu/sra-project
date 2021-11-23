public void executeCommand(java.lang.String fromIP, java.lang.String toIP) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String parsedCommand = new model.extras.InfoParser().parseField(model.notification.configuration.CommandConfiguration.getInstance().getCommand(), fromIP, toIP);
    java.util.List<java.lang.String> allArgumentsList = java.util.Arrays.asList(parsedCommand.split(java.lang.System.lineSeparator()));
    processResult = model.service.helpers.ProcessRunner.run(allArgumentsList);
}