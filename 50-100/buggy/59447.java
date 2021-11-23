private betsy.bpmn.cli.Options getOptions() {
    betsy.bpmn.cli.Options options = new betsy.bpmn.cli.Options();
    options.addOption("o", betsy.bpmn.cli.BPMNCliParser.OPEN_RESULTS_IN_BROWSER, false, "Opens results in default browser");
    options.addOption("b", betsy.bpmn.cli.BPMNCliParser.BUILD_ONLY, false, "Builds only the artifacts. Does nothing else.");
    options.addOption("h", betsy.bpmn.cli.BPMNCliParser.HELP, false, "Print usage information.");
    options.addOption("f", betsy.bpmn.cli.BPMNCliParser.USE_CUSTOM_TEST_FOLDER, true, "Use custom test folder");
    options.addOption("i", betsy.bpmn.cli.BPMNCliParser.USE_INSTALLED_ENGINE, false, "Use already installed engine.");
    options.addOption("k", betsy.bpmn.cli.BPMNCliParser.KEEP_ENGINE_RUNNING, true, "Keep the engine running. No engine shutdown!");
    return options;
}