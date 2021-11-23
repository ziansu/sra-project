public void setEllipse(tracer.Point ab, float c, float d, int ellipseMode) {
    if ((ab == null) || ((cd) == null)) {
        setEllipse(ab, new tracer.Point(c, d), ellipseMode);
    }else {
        this.ab = ab;
        cd.x = c;
        cd.y = d;
        this.ellipseMode = ellipseMode;
        setHelperFields();
    }
}