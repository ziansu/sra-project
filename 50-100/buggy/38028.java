public static java.util.Set<org.talend.core.model.general.ModuleNeeded> getRunningModules() {
    java.util.Set<org.talend.core.model.general.ModuleNeeded> runningModules = new java.util.HashSet<org.talend.core.model.general.ModuleNeeded>();
    runningModules.addAll(org.talend.librariesmanager.model.ModulesNeededProvider.getCodesModuleNeededs(ERepositoryObjectType.ROUTINES));
    runningModules.addAll(org.talend.librariesmanager.model.ModulesNeededProvider.getCodesModuleNeededs(org.talend.core.model.repository.ERepositoryObjectType.getType("BEANS")));
    runningModules.addAll(org.talend.librariesmanager.model.ModulesNeededProvider.getCodesModuleNeededs(ERepositoryObjectType.PIG_UDF));
    return runningModules;
}