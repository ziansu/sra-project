public static boolean writeOutDefaults(eu.ascetic.ioutils.io.ResultsStore rulesFile) {
    boolean answer = false;
    if (!(rulesFile.getResultsFile().exists())) {
        rulesFile.add("Unique Id");
        rulesFile.add("Agreement Term");
        rulesFile.append("Comparator");
        rulesFile.append("Event Type (Violation or Warning)");
        rulesFile.append("Guarantee Value");
        rulesFile.save();
        answer = true;
    }
    return answer;
}