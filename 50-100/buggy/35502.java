private void advance() {
    while (((skipVal) == (next)) && ((next) < (org.apache.ignite.internal.util.GridIntSet.SEGMENT_SIZE))) {
        if (super.hasNext())
            skipVal = super.next();
        
        (next)++;
    } 
}