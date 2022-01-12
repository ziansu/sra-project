public static double dS(double t) {
    double lt = t - (SIRModel.DT);
    double change = ((double) (((-1) * (SIRModel.BETA)) * (((SIRModel.S(lt)) * (SIRModel.I(lt))) / (SIRModel.N))));
    return change * (SIRModel.DT);
}