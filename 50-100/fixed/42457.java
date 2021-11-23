private static final boolean checkValue(final java.lang.String value, final java.lang.String[] tags) {
    if (null == value) {
        return false;
    }
    if (null == tags) {
        return false;
    }
    for (final java.lang.String tag : tags) {
        if (!(de.ityx.response.it.docker.image.ImageFilter.nn(tag))) {
            continue;
        }else
            if ((-1) != (tag.indexOf(value))) {
                return true;
            }
        
    }
    return false;
}