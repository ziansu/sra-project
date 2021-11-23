public double startTime() {
    java.lang.System.out.println(((("ID: " + (ID)) + " rel: ") + (relativeTo)));
    if ((relativeTo) == 0)
        return 0;
    
    Track relativeTrack = tracklist.get(tracklist.getIndexByID(relativeTo));
    double relativeTime = relativeTrack.startTime();
    if ((startEnd) == (Track.START))
        return relativeTime;
    else
        return relativeTime + (relativeTrack.getLength());
    
}