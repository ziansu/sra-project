public boolean isGreet(Sentence s) {
    Greeting greet = new Greeting();
    for (java.lang.String x : greet.greet1) {
        if (Kumar.search(x, s.sentence)) {
            return true;
        }
    }
    for (java.lang.String x : greet.greet2) {
        if (Kumar.search(x, s.sentence)) {
            return true;
        }
    }
    return false;
}