private void advance() {
    if ((skipVal) == (-1))
        if (super.hasNext())
            skipVal = super.next();
        
    
    while (((skipVal) == (next)) && ((next) < (org.apache.ignite.internal.util.GridIntSet.SEGMENT_SIZE))) {
        if (super.hasNext())
            skipVal = super.next();
        
        (next)++;
    } 
}