public double getRecallLenient() {
    if ((nResponses) == 0) {
        return 0.0;
    }else {
        return (getCorrectLenient()) / ((double) (nTargets));
    }
}