public java.lang.String runNode(java.lang.String input) throws SoFTlib.SoFTException {
    int index = de.unidue.stud.maha.Main.getInputIndex(myChar());
    int zahl = java.lang.Integer.valueOf(SoFTlib.Helper.words(input, 1, index, index));
    java.lang.String maskierer = de.unidue.stud.maha.Main.getMaskierer();
    form('e', zahl).send(maskierer);
    return "0";
}