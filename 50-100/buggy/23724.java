public long compute() {
    int temp = alphaBeta(true, AI_alpha.SEARCH_LEVEL, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
    int x = temp % 8;
    int y = temp / 8;
    java.lang.System.out.println(((("横:" + x) + "縦:") + y));
    long pos = Reversi.PosTranslate((7 - x), (y + 1));
    return pos;
}