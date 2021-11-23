@java.lang.Override
protected void initialize() {
    final org.eclipse.che.ide.api.command.CommandImpl.ApplicableContext context = editedCommand.getApplicableContext();
    applicableProjectsInitial = new java.util.HashSet(context.getApplicableProjects());
    refreshProjects();
}