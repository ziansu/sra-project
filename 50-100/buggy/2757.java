private void expandIfNeeded(int len) {
    java.nio.ByteBuffer buffer = bufferContainer.getBuffer();
    int need = len - (buffer.remaining());
    if (need <= 0)
        return ;
    
    wasExpanded = true;
    int newCapacity = ((buffer.capacity()) + need) * 2;
    bufferContainer.growBuffer(newCapacity);
}