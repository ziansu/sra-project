public static int getDataOffset(com.drmattyg.nanokaraoke.TrackEvent evt) {
    return ((evt.offset) + (evt.metaType.dataOffset)) + (evt.time.size);
}