private double[] primConverter(java.lang.Double[] valArr) {
    double[] primArr = new double[valArr.length];
    if ((valArr.length) <= 0)
        java.lang.System.err.println("ERROR: array is null");
    
    java.lang.System.out.println(("Valarr length = " + (valArr.length)));
    for (int i = 0; i < (valArr.length); i++) {
        java.lang.System.out.println(("i= " + i));
        primArr[i] = valArr[i];
    }
    return primArr;
}