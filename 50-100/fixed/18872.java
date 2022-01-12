private float getRFromString(final java.lang.String color) {
    if (isShortMode(color)) {
        return ((java.lang.Integer.parseInt(color.substring(1, 2), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) * (de.lessvoid.niftyinternal.common.ColorStringParser.SCALE_SHORT_MODE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }else {
        return (java.lang.Integer.parseInt(color.substring(1, 3), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }
}