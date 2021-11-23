public java.lang.String parseStepsHash() {
    java.lang.String outputString = "";
    for (java.lang.String term : steps.keySet()) {
        java.lang.String value = steps.get(term);
        java.lang.String lineToAdd = ((((("\"" + term) + "\"") + ": ") + value) + ",") + "\n";
        outputString = outputString + lineToAdd;
    }
    return outputString;
}