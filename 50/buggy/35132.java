public de.vandermeer.asciitable.v2.render.WidthLongestLine add(final int minWidth, final int maxWidth) {
    minWidths = org.apache.commons.lang3.ArrayUtils.add(minWidths, minWidth);
    maxWidths = org.apache.commons.lang3.ArrayUtils.add(maxWidths, maxWidth);
    return this;
}