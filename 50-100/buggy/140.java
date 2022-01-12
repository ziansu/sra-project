private void applySpecialEvents() {
    if (specialEvents.isEmpty())
        return ;
    
    for (java.util.Iterator<starvationevasion.sim.events.AbstractEvent> iterator = specialEvents.iterator(); iterator.hasNext();) {
        starvationevasion.sim.events.AbstractEvent event = iterator.next();
        event.applyEffects();
        if ((event.getDuration()) < 1) {
            specialEvents.remove(event);
        }
    }
}