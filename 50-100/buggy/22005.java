public void printStats() {
    java.lang.System.out.println("QuickSort terminates!");
    java.lang.System.out.print("Snipped: ");
    printSequence(0, 10);
    java.lang.System.out.println();
    java.lang.System.out.println((("Duration: " + (getDuration())) + " seconds"));
    java.lang.System.out.println(("Comparisons: " + (this.comparisonCounter)));
    java.lang.System.out.println(("Boundary: " + (this.b)));
}