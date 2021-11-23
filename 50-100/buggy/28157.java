public void move_biaxis_basic(double xpower, double ypower) {
    frdrive.setPower((ypower + xpower));
    brdrive.setPower((ypower - xpower));
    fldrive.setPower((-(ypower - xpower)));
    bldrive.setPower((-(ypower + xpower)));
}