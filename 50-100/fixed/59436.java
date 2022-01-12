public static void nextAnalysis() {
    while ((++(KeynoteWriter.nAnalysis)) < 0);
    if ((KeynoteWriter.nAnalysis) >= (KeynoteWriter.lstrAnalyses.size()))
        KeynoteWriter.nextQuote();
    else
        KeynoteWriter.strAnalysis = KeynoteWriter.generateAnalysis(KeynoteWriter.lstrAnalyses.get(KeynoteWriter.nAnalysis)[0], KeynoteWriter.lstrAnalyses.get(KeynoteWriter.nAnalysis)[1]);
    
}