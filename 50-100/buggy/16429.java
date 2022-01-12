public void setEllipse(float a, float b, float c, float d, int ellipseMode) {
    if (((ab) == null) || ((cd) == null)) {
        setEllipse(new tracer.Point(a, b), new tracer.Point(c, d), ellipseMode);
    }else {
        ab.x = a;
        ab.y = b;
        cd.x = c;
        cd.y = d;
        this.ellipseMode = ellipseMode;
        setHelperFields();
    }
}