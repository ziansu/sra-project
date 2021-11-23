public static nl.tudelft.pixelperfect.event.EventReader getInstance() {
    if ((nl.tudelft.pixelperfect.event.EventReader.instance) == null) {
        synchronized(nl.tudelft.pixelperfect.event.EventReader.class) {
            nl.tudelft.pixelperfect.event.EventReader.instance = new nl.tudelft.pixelperfect.event.EventReader();
        }
    }
    return nl.tudelft.pixelperfect.event.EventReader.instance;
}