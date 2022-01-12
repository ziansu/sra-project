private void fillElementBuffer() {
    while (this.isElementBufferEmpty())
        try {
            if (!(this.pi.consumeToken())) {
                if ((this.in) != null)
                    this.in.close();
                
                this.in = null;
                break;
            }
        } catch (java.io.IOException ioe) {
            this.exception = ioe;
            throw new java.lang.RuntimeException("Exception retrieving next element.", ioe);
        }
    
}