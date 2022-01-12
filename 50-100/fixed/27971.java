public static void validateContext(sun.java2d.pipe.hw.AccelSurface srcData, sun.java2d.pipe.hw.AccelSurface dstData, sun.java2d.pipe.Region clip, java.awt.Composite comp, java.awt.geom.AffineTransform xform, java.awt.Paint paint, sun.java2d.SunGraphics2D sg2d, int flags) {
    sun.java2d.pipe.BufferedContext context = dstData.getContext();
    context.validate(srcData, dstData, clip, comp, xform, paint, sg2d, flags);
}