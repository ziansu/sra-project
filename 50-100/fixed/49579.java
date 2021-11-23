private void labour(final org.joda.time.LocalDate today) {
    org.smartdeveloperhub.harvesters.it.testing.generator.ProjectDataGenerator.LOGGER.info("- Labour on {}working day {} in project {} ({}):", (org.smartdeveloperhub.harvesters.it.testing.generator.Utils.isWorkingDay(today) ? "" : "non-"), today, this.project.getName(), this.project.getId());
    createNewComponents();
    createNewVersions();
    createNewIssues(today);
    evaluateIssues(today);
    workOnIssues(today);
    reopenIssues(today);
}