public double phase_Time() {
    double k = (java.lang.Math.signum(stellarium.util.math.Spmath.getD(sciapi.api.value.util.VOp.dot(sciapi.api.value.euclidian.CrossUtil.cross(((sciapi.api.value.IValRef) (EcRPosG)), ((sciapi.api.value.IValRef) (stellarium.stellars.EcRPos))), ((sciapi.api.value.IValRef) (Pole)))))) * (1.0 - (getPhase()));
    if (k < 0)
        k = k + 2;
    
    return k / 2;
}