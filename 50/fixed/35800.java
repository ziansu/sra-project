public void free(int bufferIndex) {
    if (!(availableBuffers.contains(bufferIndex))) {
        buffers[bufferIndex].free();
        availableBuffers.add(bufferIndex);
    }
}