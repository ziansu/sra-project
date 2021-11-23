public de.vandermeer.asciitable.v2.render.WidthLongestLine add(final int minWidth, final int maxWidth) {
    this.minWidths = org.apache.commons.lang3.ArrayUtils.add(this.minWidths, minWidth);
    this.maxWidths = org.apache.commons.lang3.ArrayUtils.add(this.maxWidths, maxWidth);
    return this;
}