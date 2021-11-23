public static int getScore(int i, int j) {
    char one = Main.Istring.charAt((i - 1));
    char two = Main.Jstring.charAt((j - 1));
    int oneN = Scoring.convertCharToInt(one);
    int twoN = Scoring.convertCharToInt(two);
    return Scoring.Score[oneN][twoN];
}