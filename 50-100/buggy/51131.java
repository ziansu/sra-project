private double Distance(Generator.DataPoint p1, Generator.DataPoint p2) {
    double temp = 0;
    for (int i = 0; i < (Dimension); i++) {
        double temp0 = p1.getData()[i];
        double temp1 = p2.getData()[i];
        temp += java.lang.Math.pow((temp0 - temp1), 2.0);
    }
    if (temp == (java.lang.Double.NaN)) {
        java.lang.System.out.println("NAN!!!!!!!!!!!!!!!!!!!!!");
    }
    return temp;
}