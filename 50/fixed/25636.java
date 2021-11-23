public double GetZComponent(java.lang.String sMarker) throws java.lang.Exception {
    eng.eval((("Position = RBPosition(" + sMarker) + ", Client)"));
    eng.eval("z = Position(3)");
    double zComp = eng.getVariable("z");
    return zComp;
}