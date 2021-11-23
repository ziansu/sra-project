public void printTmpDictionary() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> d : frequencyDictionary.entrySet()) {
        java.lang.System.out.println(((("Word " + (d.getKey())) + " has frequency ") + (d.getValue())));
    }
}