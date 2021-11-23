public static double dI(double t) {
    double lt = t - (SIRModel.DT);
    double change = ((double) ((SIRModel.BETA) * (((SIRModel.S(lt)) * (SIRModel.I(lt))) / (SIRModel.N))));
    double removed = ((double) (((-1) * (SIRModel.GAMMA)) * (SIRModel.I(lt))));
    return (change + removed) * (SIRModel.DT);
}