public rx.Observable add(com.servioticy.datamodel.partials.SWAPartial partial) {
    if ((this.lastPair) == null) {
        return this.addPair(new com.servioticy.datamodel.partials.SWAPartialPair(partial, null));
    }
    com.servioticy.datamodel.partials.SWAPartialPair lastPair = this.getLastPair();
    if ((lastPair.getRight()) != null) {
        return this.addPair(new com.servioticy.datamodel.partials.SWAPartialPair(partial, null));
    }
    lastPair.setRight(partial);
    return null;
}