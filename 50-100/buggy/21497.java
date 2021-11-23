public void gameTick(int currentTime) {
    java.util.ListIterator itrUnits = this.eventsWithLifetime.listIterator();
    main.java.GraphicEvent currentEvent;
    while (itrUnits.hasNext()) {
        currentEvent = ((main.java.GraphicEvent) (itrUnits.next()));
        if (currentEvent.shouldBeRemoved(currentTime)) {
            this.eventsWithLifetime.remove();
            this.allGraphicEvents.remove(currentEvent.getId());
        }
    } 
}