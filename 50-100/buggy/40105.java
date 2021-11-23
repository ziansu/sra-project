public boolean isUserLocationTag(java.lang.String name) {
    if (isUserLocationTagsEnabled()) {
        if ((((getUserLatLngName()) != null) && (name.equals(getUserLatLngName()))) || (((getUserAccuracyName()) != null) && (name.equals(getUserAccuracyName())))) {
            return true;
        }
    }
    return false;
}