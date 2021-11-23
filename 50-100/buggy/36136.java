@java.lang.Override
public void resetPhase() {
    if (phase.equals(Phase.REFACTOR)) {
        throw new java.lang.IllegalStateException("Reset not permitted during Refactor.");
    }
    if (phase.equals(Phase.GREEN)) {
        phase = Phase.RED;
    }
    babystepsManager.start(originalExercise.getBabyStepsTestTime());
    bus.post(new de.hhu.propra16.tddtrainer.events.ExerciseEvent(validExercise));
}