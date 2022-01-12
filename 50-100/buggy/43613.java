@java.lang.Override
public void end() {
    com.kh.beatbot.track.Track track = View.context.getTrackManager().getTrackById(trackId);
    finalBeginLevel = track.getLoopBeginParam().viewLevel;
    finalEndLevel = track.getLoopEndParam().viewLevel;
    if (((initialBeginLevel) != (finalBeginLevel)) || ((initialEndLevel) != (finalEndLevel))) {
        View.context.getEventManager().eventCompleted(this);
    }
}