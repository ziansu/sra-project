private void filter_new_scanline() {
    sX = srcXOffset;
    fracV = (srcYOffset) & (processing.core.PImage.PREC_MAXVAL);
    ifV = ((processing.core.PImage.PREC_MAXVAL) - (fracV)) + 1;
    v1 = ((srcYOffset) >> (processing.core.PImage.PRECISIONB)) * (iw);
    v2 = (processing.core.PImage.min((((srcYOffset) >> (processing.core.PImage.PRECISIONB)) + 1), ih1)) * (iw);
}