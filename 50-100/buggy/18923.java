public byte getByte(long position) {
    focusSegment(position);
    if ((pointer.segment) instanceof org.exbin.deltahex.delta.FileSegment) {
        return ((org.exbin.deltahex.delta.FileSegment) (pointer.segment)).getByte(((((org.exbin.deltahex.delta.FileSegment) (pointer.segment)).getStartPosition()) + (position - (pointer.position))));
    }else {
        return ((org.exbin.deltahex.delta.MemorySegment) (pointer.segment)).getByte((position - (pointer.position)));
    }
}