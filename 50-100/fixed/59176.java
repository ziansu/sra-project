public void next() throws java.io.IOException {
    if ((buf_bound_pos) >= 0) {
        buf_pos += boundary.length;
        searchNextBoundary();
    }else {
        while (((buf_bound_pos) < 0) && ((fillBuffer()) >= 0))
            buf_pos = buf_end;
        
    }
}