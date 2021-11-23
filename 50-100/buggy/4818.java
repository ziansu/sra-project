public static void main(java.lang.String[] args) {
    edu.princeton.cs.algs4.Picture picture = new edu.princeton.cs.algs4.Picture(new java.io.File(("C:\\Users\\Borui Wang\\Desktop\\Borui Wang\\Coursera\\Algorithms Part 2\\" + ("Algorithms Part 2\\assignments\\ProgrammingAssignment2SeamCarvingHelpCenter\\" + "seamCarving-testing\\seamCarving\\3x4.png"))));
    partTwo_Assignment_2.SeamCarver sc = new partTwo_Assignment_2.SeamCarver(picture);
    sc.printEnergy();
    int height = sc.height();
    for (int w = 0; w < height; w++) {
        sc.removeHorizontalSeam(sc.findHorizontalSeam());
        sc.printEnergy();
    }
}