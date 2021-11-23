@java.lang.Override
public void resetPhase() {
    if ((phase) == (Phase.REFACTOR)) {
        throw new java.lang.IllegalStateException("Reset not permitted during Refactor.");
    }
    if ((phase) == (Phase.GREEN)) {
        phase = Phase.RED;
    }
    if ((validExercise) != null) {
        babystepsManager.start(originalExercise.getBabyStepsTestTime());
        bus.post(new de.hhu.propra16.tddtrainer.events.ExerciseEvent(validExercise));
    }
}