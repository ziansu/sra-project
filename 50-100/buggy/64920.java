public void addToAnswer(Game g, java.lang.String in) {
    java.lang.String[] tempAns = g.getRealAnswer();
    for (int i = 0; i < (tempAns.size()); i++) {
        if (tempAns[i].equals(in)) {
            playerAnswer[i] = in;
        }
    }
}