public int lineClearCalc(int linesCleared) {
    int score = ((int) (((((java.lang.Math.pow(linesCleared, 3)) / 6.0) - (java.lang.Math.pow(linesCleared, 2))) + ((23 * linesCleared) / 6.0)) - 2));
    java.lang.System.out.println(score);
    return score * (pointsPerLine);
}