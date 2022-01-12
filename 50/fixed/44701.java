public static java.awt.Rectangle pointsToRectangle(final int minX, final int minZ, final int maxX, final int maxZ) {
    return new java.awt.Rectangle(minX, minZ, (maxX - minX), (maxZ - minZ));
}