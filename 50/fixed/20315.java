private double sedimentation(double v) {
    if (v > (parms.Vd))
        return 0;
    
    return (parms.Cd) / v;
}