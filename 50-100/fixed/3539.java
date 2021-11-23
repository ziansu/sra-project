@java.lang.Override
public void addFrame(final java.awt.image.BufferedImage bi) throws sk.freemap.gpxAnimator.UserException {
    final java.io.File outputfile = new java.io.File(java.lang.String.format(frameFilePattern, (++(frame))));
    try {
        javax.imageio.ImageIO.write(bi, imageType, outputfile);
    } catch (final java.io.IOException e) {
        throw new sk.freemap.gpxAnimator.UserException(("error writing frame to " + outputfile), e);
    }
}