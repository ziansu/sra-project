public static double S(double t) {
    double count = SIRModel.getRecord(SIRModel.S_HIST, t);
    if (count >= 0) {
        return count;
    }else {
        double lt = t - (SIRModel.DT);
        double newCount = (SIRModel.S(lt)) + (SIRModel.dS(t));
        SIRModel.S_HIST.add(newCount);
        return newCount;
    }
}