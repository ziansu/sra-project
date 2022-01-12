public boolean connect(java.lang.String port) throws java.io.IOException {
    if ((getX().getPin()) == null) {
        error("x pin not set");
        return false;
    }
    if ((getY().getPin()) == null) {
        error("y pin not set");
        return false;
    }
    return connect("COM18", getX().getPin(), getY().getPin(), getOpenCV().getCameraIndex());
}