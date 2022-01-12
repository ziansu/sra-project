public boolean isUserLocationTag(java.lang.String name) {
    if (isUserLocationTagsEnabled(true)) {
        if ((((getUserLatLngName()) != null) && (name.equals(getUserLatLngName()))) || (((getUserAccuracyName()) != null) && (name.equals(getUserAccuracyName())))) {
            return true;
        }
    }
    return false;
}