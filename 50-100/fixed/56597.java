public boolean eof(org.perl6.nqp.runtime.ThreadContext tc) {
    if (eof)
        return true;
    else
        if (((readBuffer) != null) && ((readBuffer.remaining()) > 0))
            return false;
        else {
            try {
                eof = (fc.position()) >= (fc.size());
                return eof;
            } catch (java.lang.Exception e) {
                eof = true;
                return true;
            }
        }
    
}