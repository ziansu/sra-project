public void remove(org.nusco.narjillos.shared.things.Thing thing) {
    getArea(thing).remove(thing);
    allTheThings.remove(thing);
    countsByLabel.put(thing.getLabel(), ((countsByLabel.get(thing.getLabel())) - 1));
}