public java.util.List<bwta.BaseLocation> getBaseLocations() {
    if ((this.baseLocations) == null) {
        this.baseLocations = new java.util.ArrayList<>();
        for (long id : this.baseLocationIds) {
            this.baseLocations.add(bwta.BaseLocation.getCachedBaseLocation(id));
        }
    }
    return this.baseLocations;
}