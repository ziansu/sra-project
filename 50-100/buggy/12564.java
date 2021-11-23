public static double getFireIndex(java.lang.String sent1) {
    RapAnalyzer fire = new RapAnalyzer();
    double t = (RapAnalyzer.sentenceanalyzer(sent1)) * 10;
    double w = (RapAnalyzer.wordlength(sent1)) * 0.5;
    double y = (RapAnalyzer.wordvariety(sent1)) * 0.5;
    RapAnalyzer.fireindex = ((t + w) + y) / 3;
    java.lang.System.out.println(("fireindex: " + (RapAnalyzer.fireindex)));
    return RapAnalyzer.fireindex;
}