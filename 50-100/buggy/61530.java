public void setEllipse(tracer.Point ab, tracer.Point cd, int ellipseMode) {
    switch (ellipseMode) {
        case CORNERS :
            this.ab = ab;
            this.cd = cd;
            break;
        case CORNER :
        case CENTER :
        case RADIUS :
            this.ab = ab;
            this.cd = new tracer.Point(cd);
            break;
        default :
            java.lang.System.err.println("Invalid ellipseMode. Use CORNERS, CORNER, CENTER, or RADIUS.");
            setEllipse(ab, cd, paths.CORNER);
            break;
    }
    this.ellipseMode = ellipseMode;
    setHelperFields();
}