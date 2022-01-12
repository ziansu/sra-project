public static int[] rectangleToPoints(final java.awt.Rectangle bounds) {
    return new int[]{ bounds.x , (bounds.x) + (bounds.width) , bounds.y , (bounds.y) + (bounds.height) };
}