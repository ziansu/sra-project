@java.lang.Override
public final void receiveEvent(io.sarl.lang.core.Event event) {
    final java.lang.Class<? extends io.sarl.lang.core.Event> eventType = event.getClass();
    if (!(io.mochalog.sarl.beliefs.social.BeliefDisclosure.class.equals(eventType))) {
        io.mochalog.sarl.beliefs.social.BeliefDisclosure disclosure = ((io.mochalog.sarl.beliefs.social.BeliefDisclosure) (event));
        overhear(disclosure);
    }
}