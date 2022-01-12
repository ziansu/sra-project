private void runProjectionContextBuildingPasses() throws org.scribble.main.ScribbleException {
    runVisitorPassOnProjectedModules(org.scribble.visit.ModuleContextBuilder.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.ProtocolDeclContextBuilder.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.RoleCollector.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.ProjectedChoiceDoPruner.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.ProjectedChoiceSubjectFixer.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.ProjectedRoleDeclFixer.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.ProtocolDefInliner.class);
    runVisitorPassOnProjectedModules(org.scribble.visit.InlinedProtocolUnfolder.class);
}