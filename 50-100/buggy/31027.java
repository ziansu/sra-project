public java.util.LinkedList<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> findForward(osgi.enroute.trains.track.util.Tracks.SegmentHandler<T> destination) {
    java.util.LinkedList<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> route = new java.util.LinkedList<>();
    if (find(route, destination, true))
        return route;
    else
        return null;
    
}