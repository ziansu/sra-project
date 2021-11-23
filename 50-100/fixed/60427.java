protected static int __offset(int vtable_offset, int offset, java.nio.ByteBuffer bb) {
    int vtable = (bb.array().length) - offset;
    return (bb.getShort(((vtable + vtable_offset) - (bb.getShort(vtable))))) != 0 ? (bb.getShort(((vtable + vtable_offset) - (bb.getShort(vtable))))) + vtable : 0;
}