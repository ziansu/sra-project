protected java.lang.Process execFrom(java.lang.String path, org.apache.log4j.Level level, int statOption, int traceOption, java.lang.String... codeOptions) throws org.talend.designer.runprocess.ProcessorException {
    java.lang.String[] cmd = getCommandLine(true, false, statOption, traceOption, codeOptions);
    org.talend.designer.core.runprocess.Processor.logCommandLine(cmd, level);
    try {
        return java.lang.Runtime.getRuntime().exec(cmd, null, new java.io.File(path));
    } catch (java.io.IOException ioe) {
        throw new org.talend.designer.runprocess.ProcessorException(org.talend.designer.core.i18n.Messages.getString("Processor.execFailed"), ioe);
    }
}