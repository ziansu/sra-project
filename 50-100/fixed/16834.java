public static void setCanvasSize(int canvasWidth, int canvasHeight) {
    if ((canvasWidth <= 0) || (canvasHeight <= 0))
        throw new java.lang.IllegalArgumentException("width and height must be positive");
    
    edu.princeton.cs.algs4.StdDraw.width = canvasWidth;
    edu.princeton.cs.algs4.StdDraw.height = canvasHeight;
    edu.princeton.cs.algs4.StdDraw.init();
}