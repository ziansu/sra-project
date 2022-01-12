private void checkProject(hudson.model.Item item) {
    hudson.model.AbstractProject<?, ?> project = ((hudson.model.AbstractProject<?, ?>) (item));
    if (((isValidCandidateForRestart(project)) && (org.jenkinsci.plugins.periodicreincarnation.Utils.qualifyForUnchangedRestart(project))) && (!(scheduledProjects.contains(project.getFullDisplayName())))) {
        this.scheduledProjects.add(project.getFullDisplayName());
        this.unchangedRestartProjects.add(project);
    }
}