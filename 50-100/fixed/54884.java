public java.lang.Iterable<fiji.plugin.trackmate.Spot> getSpotsInFrame(java.lang.String channel, int cellNb, int frame) {
    if (!(getCells(channel).containsKey(cellNb))) {
        return null;
    }
    return getSpots(channel, cellNb).iterable(frame, false);
}