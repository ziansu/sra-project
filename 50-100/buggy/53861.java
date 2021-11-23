@java.lang.Override
public hudson.model.Action getProjectAction(hudson.model.AbstractProject<?, ?> project) {
    if ((!(project.getBuilds().isEmpty())) || (!(project.getActions().isEmpty()))) {
        org.evosuite.jenkins.actions.BuildAction buildAction = project.getLastBuild().getAction(org.evosuite.jenkins.actions.BuildAction.class);
        if (buildAction != null) {
            org.evosuite.jenkins.actions.ProjectAction lastProject = buildAction.getProjectAction();
            return new org.evosuite.jenkins.actions.ProjectAction(project, lastProject.getModules());
        }
    }
    return new org.evosuite.jenkins.actions.ProjectAction(project);
}