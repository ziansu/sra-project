public void progressTimeInstantaneous(grid.Grid gr) {
    while ((!(eventQueue.isEmpty())) && ((eventQueue.peek().getTriggerDelay()) == (time))) {
        eventQueue.remove().execute(gr);
    } 
}