public boolean isGreet(Sentence s) {
    Greeting greet = new Greeting();
    for (java.lang.String x : greet.greet1) {
        if (Kumar.search(x, s.sentence)) {
            java.lang.System.out.println("pardeep");
            return true;
        }
    }
    for (java.lang.String x : greet.greet2) {
        if (Kumar.search(x, s.sentence)) {
            java.lang.System.out.println("nala");
            return true;
        }
    }
    return false;
}