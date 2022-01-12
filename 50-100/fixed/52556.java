public static double dS(double t) {
    double lt = t - (SIRModel.DT);
    double change = ((-1.0) * (SIRModel.BETA)) * (((SIRModel.S(lt)) * (SIRModel.I(lt))) / (SIRModel.N));
    return change * (SIRModel.DT);
}