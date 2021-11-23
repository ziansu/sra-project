@org.junit.Before
public void createPhaseManager() {
    phaseManager = new tddtrainer.logic.PhaseManager(new tddtrainer.tracking.TrackingManager(new com.google.common.eventbus.EventBus()), new tddtrainer.gui.catalog.ExerciseSelector(new tddtrainer.catalog.FakeCatalogDatasource(), null), new com.google.common.eventbus.EventBus());
    java.util.List<tddtrainer.catalog.Exercise> fcd = new tddtrainer.catalog.FakeCatalogDatasource().loadCatalog();
    exerciseWithCompileError = fcd.get(1);
    exerciseWithTestError = fcd.get(2);
    exerciseWorking = fcd.get(0);
    exerciseSyntaxError = fcd.get(3);
    exerciseMissingTest = fcd.get(4);
}