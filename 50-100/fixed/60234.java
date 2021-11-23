@java.lang.Override
public void on(final org.mwg.struct.Buffer result) {
    if ((result != null) && ((result.length()) > 0)) {
        org.mwg.chunk.Chunk loadedChunk = createAndMark(type, world, time, id);
        loadedChunk.load(result);
        result.free();
        callback.on(loadedChunk);
    }else {
        keys.free();
        callback.on(null);
    }
}