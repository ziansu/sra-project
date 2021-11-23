public void remove(org.nusco.narjillos.shared.things.Thing thing) {
    getArea(thing).remove(thing);
    synchronized(allTheThings) {
        allTheThings.remove(thing);
    }
    synchronized(countsByLabel) {
        countsByLabel.put(thing.getLabel(), ((countsByLabel.get(thing.getLabel())) - 1));
    }
}