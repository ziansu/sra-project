public double getRecallLenient() {
    if ((nTargets) == 0) {
        return 0.0;
    }else {
        return (getCorrectLenient()) / ((double) (nTargets));
    }
}