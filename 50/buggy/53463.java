public boolean removeBreakpoint(int index) {
    if ((index < 0) || (index > (breakpoints.size())))
        return false;
    
    breakpoints.remove(index);
    return true;
}