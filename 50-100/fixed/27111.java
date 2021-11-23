public java.util.LinkedList<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> findBackward(osgi.enroute.trains.track.util.Tracks.SegmentHandler<T> destination) {
    java.util.LinkedList<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> route = new java.util.LinkedList<>();
    if (find(route, destination, false))
        return new java.util.LinkedList<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>>(route);
    else
        return null;
    
}