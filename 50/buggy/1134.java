public double getRecallStrict() {
    if ((nResponses) == 0) {
        return 0.0;
    }else {
        return (nCorrectStrict) / ((double) (nTargets));
    }
}