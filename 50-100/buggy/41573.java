public void setPhase(double[] alpha) {
    if ((alpha == null) || ((alpha.length) == 0)) {
        nPhase = 0;
    }else {
        setNPhase(alpha.length);
        phase_coefs = phaseSpace.wrap(alpha);
        setPhase(phase_coefs);
    }
}