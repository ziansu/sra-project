public boolean equals(Vector that, double epsilon) {
    if ((getDimensions()) != (that.getDimensions()))
        return false;
    
    for (int i = 0; i < (getDimensions()); ++i) {
        if (!((java.lang.Math.abs(((get(i)) - (that.get(i))))) < epsilon))
            return false;
        
    }
    return true;
}