public boolean add(com.servioticy.datamodel.partials.SWAPartial partial) {
    if ((this.lastPair) == null) {
        this.addPair(new com.servioticy.datamodel.partials.SWAPartialPair(partial, null));
        return false;
    }
    com.servioticy.datamodel.partials.SWAPartialPair lastPair = this.getLastPair();
    if ((lastPair.getRight()) != null) {
        this.addPair(new com.servioticy.datamodel.partials.SWAPartialPair(partial, null));
        return true;
    }
    lastPair.setRight(partial);
    return false;
}