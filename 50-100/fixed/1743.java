static boolean check(java.lang.String line) {
    java.lang.String[] words = line.split(" ");
    int counter = 0;
    for (java.lang.String word : words) {
        if ((word.length()) != 0) {
            counter++;
        }
    }
    return counter > 5;
}