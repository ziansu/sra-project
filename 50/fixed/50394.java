public java.lang.String getLocationName() {
    models.Location l = getLocation();
    if (l != null)
        return l.getName();
    
    return null;
}