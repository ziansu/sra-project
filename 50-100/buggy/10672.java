public double[] Project(double[] Xrgb) {
    assert (Xrgb.length) == 2;
    java.lang.System.out.println(((("X = " + (Xrgb[0])) + "Y = ") + (Xrgb[1])));
    int index = pointmap[((int) (((Xrgb[1]) * (Constants.WIDTH)) + (Xrgb[0])))];
    double[] P = this.points.get(index);
    return P;
}