public static void main(java.lang.String[] args) {
    alignment.Input input = new alignment.Input();
    alignment.Traceback traceback = new alignment.Traceback();
    alignment.DnaSequencer dnasequencer = new alignment.DnaSequencer();
    dnasequencer.setInput(input);
    dnasequencer.setTraceback(traceback);
    dnasequencer.simulate();
    dnasequencer.printInitializedMatrix();
    dnasequencer.printPopulatedMatrix();
    dnasequencer.getTraceback().printAllAlignments(input.getDna1(), input.getDna2());
}