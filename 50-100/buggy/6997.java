public static void main(java.lang.String[] args) {
    double[] l = new double[]{ 3 , 1 , 4 , 1 , 5 , 9 , 2 , 6 , 5 };
    Matrix m = new Matrix(3, 3, l);
    java.lang.System.out.println(m.multiply(m.inverse()));
}