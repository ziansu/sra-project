private void printUsage(com.beust.jcommander.JCommander jc) {
    com.beust.jcommander.JCommander importJc = jc.getCommands().get(com.blueprint.centromere.core.dataimport.cli.CommandLineInputExecutor.IMPORT_COMMAND);
    jc.usage(com.blueprint.centromere.core.dataimport.cli.CommandLineInputExecutor.IMPORT_COMMAND);
    importJc.usage(com.blueprint.centromere.core.dataimport.cli.CommandLineInputExecutor.IMPORT_FILE_COMMAND);
    importJc.usage(com.blueprint.centromere.core.dataimport.cli.CommandLineInputExecutor.IMPORT_BATCH_COMMAND);
}