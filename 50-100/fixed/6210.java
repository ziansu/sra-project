private void checkProject(hudson.model.AbstractProject<?, ?> project) {
    if (((isValidCandidateForRestart(project)) && (org.jenkinsci.plugins.periodicreincarnation.Utils.qualifyForUnchangedRestart(project))) && (!(scheduledProjects.contains(project.getFullDisplayName())))) {
        this.scheduledProjects.add(project.getFullDisplayName());
        this.unchangedRestartProjects.add(project);
    }
}