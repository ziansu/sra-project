public boolean contains(wslf.geometry.Point point) {
    if (point == null) {
        return false;
    }
    return (v.getAngle(new wslf.geometry.Vector(this.p, point))) < (Constants.EPS_ANGLE);
}