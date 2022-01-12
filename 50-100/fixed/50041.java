private boolean isElementPaintable(final boolean noArrow1, final boolean noArrow2, final double min, final double max, final double i) {
    return (noArrow2 || (!(net.sf.latexdraw.util.LNumber.equalsDouble(max, i)))) && (noArrow1 || (!(net.sf.latexdraw.util.LNumber.equalsDouble(min, i))));
}