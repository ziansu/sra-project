@java.lang.Override
public void cloneFrom(org.mwdb.chunk.heap.KStateChunk origin) {
    org.mwdb.chunk.heap.HeapStateChunk casted = ((org.mwdb.chunk.heap.HeapStateChunk) (origin));
    this.state.set(casted.state.get().cloneState());
}