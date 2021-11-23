static <T> com.yahoo.sketches.sampling.ReservoirItemsSketch<T> getInstance(final java.util.ArrayList<T> data, final long itemsSeen, final com.yahoo.sketches.ResizeFactor rf, final short encodedResSize) {
    return new com.yahoo.sketches.sampling.ReservoirItemsSketch(data, itemsSeen, rf, encodedResSize);
}