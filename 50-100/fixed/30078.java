public static double dI(double t) {
    double lt = t - (SIRModel.DT);
    double change = (SIRModel.BETA) * (((SIRModel.S(lt)) * (SIRModel.I(lt))) / (SIRModel.N));
    double removed = ((-1.0) * (SIRModel.GAMMA)) * (SIRModel.I(lt));
    return (change + removed) * (SIRModel.DT);
}