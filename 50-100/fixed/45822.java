public boolean compareDestinations(com.infosupport.bi.Attribute destination, java.lang.String transformation) {
    if ((transformation == null) && ((this.transformation) == null)) {
        return this.destination.compareAttributes(destination);
    }else
        if ((transformation != null) && ((this.transformation) != null)) {
            return (this.transformation.equals(transformation)) && (this.destination.compareAttributes(destination));
        }else {
            return false;
        }
    
}