private void analysisCondition(java.lang.String conditions) throws oop.ex6.main.IllegalException {
    variables.add(new java.util.HashMap<>());
    java.lang.String splitter = "(\\&{2})|(\\|{2})";
    java.lang.String[] parts = conditions.split(splitter);
    for (java.lang.String condition : parts) {
        if ((condition.equals("true")) || (condition.equals("false"))) {
            continue;
        }else {
            while ((condition.length()) > 0) {
            } 
        }
    }
}