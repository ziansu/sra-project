public java.lang.Integer getDisplayOrder() {
    int matchNumber = getMatchNumber();
    int setNumber = getSetNumber();
    return (((getType().getPlayOrder()) * 1000000) + (setNumber * 1000)) + matchNumber;
}