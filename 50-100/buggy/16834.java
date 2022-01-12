public static void setCanvasSize(int canvasWidth, int canvasHeight) {
    if (((edu.princeton.cs.algs4.StdDraw.width) <= 0) || ((edu.princeton.cs.algs4.StdDraw.height) <= 0))
        throw new java.lang.IllegalArgumentException("width and height must be positive");
    
    edu.princeton.cs.algs4.StdDraw.width = canvasWidth;
    edu.princeton.cs.algs4.StdDraw.height = canvasHeight;
    edu.princeton.cs.algs4.StdDraw.init();
}