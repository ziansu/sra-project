@java.lang.Override
public void flush() throws java.io.IOException {
    if ((binbufcnt) <= (binbuf.length))
        decideMode();
    
    buf = -1;
    out.flush();
}