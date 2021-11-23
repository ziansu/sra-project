@java.lang.Override
public void run() {
    tracker.getLocation();
    currentTrack.addNode(tracker.getLat(), tracker.getLon(), java.util.Calendar.getInstance().getTime().getTime());
    com.example.piotrhelm.simplytrackme.TrackJSON.toJSON(currentTrack);
}