private boolean hasValidPageNumbersOnly() {
    boolean correct = true;
    for (java.lang.String page : pages) {
        correct = (correct && ((page.matches("[0-9]+")) && ((page.length()) >= 5))) ? true : false;
    }
    return correct;
}