public void setProximityMarks(final java.util.List<com.onlylemi.mapview.library.graphics.implementation.ProximityMark> proxMarks) {
    this.markObjects.removeAll(this.proxMarks);
    if (!(proxMarks.isEmpty())) {
        this.proxMarks = new java.util.ArrayList(proxMarks.size());
        java.util.Collections.copy(this.proxMarks, proxMarks);
        this.markObjects.addAll(this.proxMarks);
    }
}