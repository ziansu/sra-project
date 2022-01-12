public java.util.List<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> findBackward(osgi.enroute.trains.track.util.Tracks.SegmentHandler<T> destination) {
    java.util.List<osgi.enroute.trains.track.util.Tracks.SegmentHandler<T>> route = new java.util.ArrayList<>();
    if (find(route, destination, false))
        return route;
    else
        return null;
    
}