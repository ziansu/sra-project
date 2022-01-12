private void mark_restore(int lo, int hi, int mark_stack_base) {
    if (hi <= lo)
        return ;
    
    int size = (hi - lo) + 1;
    this.mark_stack_base = mark_stack_base - size;
    TRACE(0, ptr, ((((("copy " + lo) + ":") + hi) + " from ") + mark_stack_base));
    java.lang.System.arraycopy(mark_stack, this.mark_stack_base, mark, lo, size);
}