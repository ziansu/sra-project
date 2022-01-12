protected int __offset(int vtable_offset) {
    if ((bb) == null)
        return 0;
    
    int vtable = (bb_pos) - (bb.getInt(bb_pos));
    return vtable_offset < (bb.getShort(vtable)) ? bb.getShort((vtable + vtable_offset)) : 0;
}