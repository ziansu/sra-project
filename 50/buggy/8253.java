public void setX(double x) {
    double temp = this.x;
    this.x = x;
    java.lang.System.out.println(("Moved " + (java.lang.Math.abs((temp - (this.x))))));
}