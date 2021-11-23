public java.util.Set<org.nusco.narjillos.shared.things.Thing> getAll(java.lang.String label) {
    synchronized(allTheThings) {
        return filterByLabel(allTheThings, label);
    }
}