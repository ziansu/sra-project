public void printGrid(java.lang.String[][] gridDis) {
    java.lang.System.out.println("----------");
    for (java.lang.String[] i : gridDis) {
        for (java.lang.String x : i) {
            java.lang.System.out.print((x + " "));
        }
        java.lang.System.out.println("");
    }
    java.lang.System.out.println("----------");
}