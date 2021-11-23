public void combineSections(final java.util.Vector<Debrief.Wrappers.Track.TrackSegment> res) {
    final Debrief.Wrappers.Track.TrackSegment keeper = res.firstElement();
    final java.util.Iterator<Debrief.Wrappers.Track.TrackSegment> iter = res.iterator();
    while (iter.hasNext()) {
        final Debrief.Wrappers.Track.TrackSegment pl = iter.next();
        if (pl != keeper) {
            keeper.append(((MWC.GUI.Layer) (pl)));
        }
        _thePositions.removeElement(pl);
    } 
    _thePositions.addSegment(keeper);
    setRelativePending();
}