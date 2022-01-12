protected java.lang.Process execFrom(java.lang.String path, org.apache.log4j.Level level, int statOption, int traceOption, java.lang.String... codeOptions) throws org.talend.designer.runprocess.ProcessorException {
    java.lang.String[] cmd = getCommandLine(true, false, statOption, traceOption, codeOptions);
    org.talend.designer.core.runprocess.Processor.logCommandLine(cmd, level);
    return exec(cmd, path);
}