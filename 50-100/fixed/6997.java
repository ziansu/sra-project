public static void main(java.lang.String[] args) {
    double[] l = new double[]{ 1 , 2 , 3 , 4 };
    Matrix m = new Matrix(2, 2, l);
    java.lang.System.out.println(m.inverse().multiply(m));
}