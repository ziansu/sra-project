protected java.lang.String getCommandByTalendJob(java.lang.String targetPlatform, org.talend.core.model.process.IProcess process, java.lang.String context, boolean needContext, int statisticPort, int tracePort, java.lang.String... codeOptions) {
    java.lang.String[] cmd = new java.lang.String[]{  };
    try {
        cmd = org.talend.designer.runprocess.ProcessorUtilities.getCommandLine(targetPlatform, true, process, context, needContext, statisticPort, tracePort, codeOptions);
    } catch (org.talend.designer.runprocess.ProcessorException e) {
        org.talend.commons.exception.ExceptionHandler.process(e);
    }
    return org.talend.designer.runprocess.ProcessorUtilities.generateCmdByTalendJob(cmd);
}