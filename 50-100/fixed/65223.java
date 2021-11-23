private void mark_restore(int lo, int hi, int mark_stack_base) {
    if (hi <= lo)
        return ;
    
    int size = (hi - lo) + 1;
    this.mark_stack_base = mark_stack_base - size;
    java.lang.System.arraycopy(mark_stack, this.mark_stack_base, mark, lo, size);
}