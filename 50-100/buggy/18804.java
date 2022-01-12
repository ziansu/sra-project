private void setPrefixFromBinary() {
    boolean breakpoint = false;
    int field = 3;
    int bit = 7;
    int prefix = 0;
    while ((field >= 0) && (!breakpoint)) {
        while ((bit >= 0) && (!breakpoint)) {
            if ((bytes[field].getBinaryValue()[bit]) == 1)
                ++prefix;
            else
                breakpoint = true;
            
            --bit;
        } 
        --field;
    } 
    this.prefix = prefix;
}