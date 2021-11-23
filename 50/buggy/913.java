protected static boolean isNonTransparent(final java.awt.Color alphaHolder) {
    final boolean isNonTransparent = (alphaHolder.getAlpha()) == (org.freeplane.core.util.ColorUtils.NON_TRANSPARENT_ALPHA);
    return isNonTransparent;
}