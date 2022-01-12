private static java.awt.image.BufferedImage setLuminosity(java.awt.image.BufferedImage image, float scale) {
    float[] scales = new float[]{ scale };
    float[] offsets = new float[]{ 0 };
    return utopia.vision.resource.Sprite.filter(image, new java.awt.image.RescaleOp(scales, offsets, null));
}