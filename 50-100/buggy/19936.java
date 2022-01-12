public static int getScore(int i, int j) {
    char one = Main.Istring.charAt(i);
    char two = Main.Jstring.charAt(j);
    int oneN = Scoring.convertCharToInt(one);
    int twoN = Scoring.convertCharToInt(two);
    return Scoring.Score[oneN][twoN];
}