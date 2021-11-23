public void progressTimeInstantaneous(grid.Grid gr) {
    while ((!(eventQueue.isEmpty())) && ((eventQueue.peek().getTriggerDelay()) == (time))) {
        java.lang.System.out.println(eventQueue.peek().getAffectedId());
        eventQueue.remove().execute(gr);
    } 
}