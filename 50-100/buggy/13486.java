private float getGFromString(final java.lang.String color) {
    if (isShortMode(color)) {
        return ((java.lang.Integer.valueOf(color.substring(2, 3), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) * (de.lessvoid.niftyinternal.common.ColorStringParser.SCALE_SHORT_MODE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }else {
        return (java.lang.Integer.valueOf(color.substring(3, 5), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }
}