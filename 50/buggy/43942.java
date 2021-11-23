@java.lang.Override
public void init(final int x, final int y) {
    synchronized(labelLocation) {
        super.init(x, y);
        paint(x, y, bdv.labels.labelset.PairVolatileLabelMultisetLongARGBConverter.TRANSPARENT_LABEL);
    }
    viewer.requestRepaint();
}