public boolean compareDestinations(com.infosupport.bi.Attribute destination, java.lang.String transformation) {
    if ((transformation == null) || ((this.transformation) == null)) {
        return false;
    }else {
        return (this.transformation.equals(transformation)) && (this.destination.compareAttributes(destination));
    }
}