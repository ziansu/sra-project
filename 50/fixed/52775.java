@java.lang.Override
public boolean hasNext() {
    return ((iteratorOffset) < (length)) && (!(com.drmattyg.nanokaraoke.TrackChunk.isTrackChunk(mf, iteratorOffset)));
}