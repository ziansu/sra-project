public boolean isCorrect(Game g, java.lang.String in) {
    java.lang.String[] tempAns = g.getRealAnswer();
    return (tempAns.indexOf(in)) > 0;
}