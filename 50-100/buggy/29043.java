public static void main(java.lang.String[] args) {
    int[] xPoints = new int[]{ -2 , 2 , -2 , 2 };
    int[] yPoints = new int[]{ 2 , 2 , -2 , -2 };
    final java.awt.Polygon polygon = new java.awt.Polygon(xPoints, yPoints, xPoints.length);
    boolean checkPoint = polygon.contains(1, 1);
    java.lang.System.out.print(checkPoint);
    java.lang.System.out.println(polygon.getBounds());
}