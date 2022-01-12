private synchronized void write(boolean isout, byte[] b, int off, int len) throws java.io.IOException {
    com.twosigma.beaker.jvm.threads.BeakerOutputHandler hdl = getHandler(isout);
    if (hdl != null)
        hdl.write(b, off, len);
    else
        if (isout)
            orig_out.write(b);
        else
            orig_err.write(b);
        
    
}