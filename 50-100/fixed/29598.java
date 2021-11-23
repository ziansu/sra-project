private float getBFromString(final java.lang.String color) {
    if (isShortMode(color)) {
        return ((java.lang.Integer.parseInt(color.substring(3, 4), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) * (de.lessvoid.niftyinternal.common.ColorStringParser.SCALE_SHORT_MODE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }else {
        return (java.lang.Integer.parseInt(color.substring(5, 7), de.lessvoid.niftyinternal.common.ColorStringParser.HEX_BASE)) / (de.lessvoid.niftyinternal.common.ColorStringParser.MAX_INT_VALUE);
    }
}