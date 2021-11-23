public java.lang.String parseStepsHash() {
    java.lang.String outputString = "";
    for (java.lang.String term : steps.keySet()) {
        java.lang.Integer value = steps.get(term);
        java.lang.String lineToAdd = ((((("\"" + term) + "\"") + ": ") + (value.toString())) + ",") + "\n";
        outputString = outputString + lineToAdd;
    }
    return outputString;
}