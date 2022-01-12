public double[] Project(double[] Xrgb) {
    assert (Xrgb.length) == 2;
    int index = pointmap[((int) (((Xrgb[1]) * (Constants.WIDTH)) + (Xrgb[0])))];
    double[] P = this.points.get(index);
    return P;
}