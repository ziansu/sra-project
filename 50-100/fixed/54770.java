public void printTopThree() {
    if ((topThree) != null) {
        for (int i = 0; i < (topThree.size()); i++) {
            java.lang.System.out.println(((("Request " + i) + ": ") + (topThree.get(i))));
        }
    }
}