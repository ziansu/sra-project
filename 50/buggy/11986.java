@java.lang.Override
public void endOfMacroStep(edu.umn.crisys.plexil.runtime.plx.JavaPlan plan) {
    if (!(outOfEvents())) {
        env.applyEvent(events.get(eventCounter));
        (eventCounter)++;
    }
}