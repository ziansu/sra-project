public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.String> conf = cs.nuim.ie.worflowHelper.FileHelper.myFileReader("veriGT.conf");
    cs.nuim.ie.workflowRunner.xpandExec.projName = conf.get("projname");
    cs.nuim.ie.workflowRunner.xpandExec.dirs = cs.nuim.ie.worflowHelper.FileHelper.myFileCreator(cs.nuim.ie.workflowRunner.xpandExec.base, cs.nuim.ie.workflowRunner.xpandExec.projName);
    cs.nuim.ie.workflowRunner.xpandExec.genMetamodels(cs.nuim.ie.workflowRunner.xpandExec.projName);
    cs.nuim.ie.workflowRunner.xpandExec.genExternalConfigruation(cs.nuim.ie.workflowRunner.xpandExec.projName, "_TranslationValidation");
    cs.nuim.ie.workflowRunner.xpandExec.genExecSem(cs.nuim.ie.workflowRunner.xpandExec.projName);
    cs.nuim.ie.workflowRunner.xpandExec.genRuntime(cs.nuim.ie.workflowRunner.xpandExec.projName);
}