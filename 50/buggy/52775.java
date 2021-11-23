@java.lang.Override
public boolean hasNext() {
    return !(com.drmattyg.nanokaraoke.TrackChunk.isTrackChunk(mf, iteratorOffset));
}