public boolean containsKey(java.lang.Object arg0) {
    if (isMapInitialized) {
        if (topLevelMap.containsKey(arg0)) {
            return true;
        }
    }else {
        try {
            this.resourceBundle.getObject(((java.lang.String) (arg0)));
            return true;
        } catch (java.lang.NullPointerException e) {
        } catch (java.util.MissingResourceException e) {
        }
    }
    return false;
}