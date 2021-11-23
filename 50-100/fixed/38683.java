@org.junit.Test
public void removeOrphanSteps_should_not_remove_root_step() {
    repository.clear();
    assertNotNull(repository.get(rootStep.getId(), org.talend.dataprep.api.preparation.Step.class));
    cleaner.removeOrphanSteps();
    cleaner.removeOrphanSteps();
    cleaner.removeOrphanSteps();
    assertNotNull(repository.get(rootStep.getId(), org.talend.dataprep.api.preparation.Step.class));
}