public f4.Element[] decode(f4.Element[] transmission) {
    passSoftInformation(transmission);
    init();
    propagateBeliefs();
    java.lang.System.out.println();
    return getDecodeState();
}