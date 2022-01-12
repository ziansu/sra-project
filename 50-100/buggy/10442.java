public static int S(double t) {
    int count = SIRModel.getRecord(SIRModel.S_HIST, t);
    if (count != (-1)) {
        return count;
    }else {
        double lt = t - (SIRModel.DT);
        int newCount = ((int) ((SIRModel.S(lt)) + (SIRModel.dS(t))));
        SIRModel.S_HIST.add(newCount);
        return newCount;
    }
}