private double Distance(Generator.DataPoint p1, Generator.DataPoint p2) {
    double temp = 0;
    double temp0 = 0;
    double temp1 = 0;
    for (int i = 0; i < (Dimension); i++) {
        temp0 = p1.getData()[i];
        temp1 = p2.getData()[i];
        temp += java.lang.Math.pow((temp0 - temp1), 2.0);
    }
    return temp;
}