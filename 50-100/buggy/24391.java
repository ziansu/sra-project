private void enableProcessors() {
    org.esa.beam.framework.ui.command.CommandManager commandManager = getAppContext().getApplicationPage().getCommandManager();
    java.lang.String namesToExclude = gov.nasa.gsfc.seadas.processing.general.ProcessorTypeInfo.getExcludedProcessorNames();
    for (java.lang.String processorName : gov.nasa.gsfc.seadas.processing.general.ProcessorTypeInfo.getProcessorNames()) {
        if (!(namesToExclude.contains(processorName))) {
            commandManager.getCommand(processorName).setEnabled(true);
        }
    }
    commandManager.getCommand("install_ocssw.py").setText("Update Data Processors");
}