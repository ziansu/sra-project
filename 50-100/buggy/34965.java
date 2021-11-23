public static void main(java.lang.String[] args) throws java.io.IOException {
    WordLadders.WordLadders wl = new WordLadders.WordLadders();
    wl.findAllClosestPaths();
    wl.addWordtoList("where");
    wl.addWordtoList("there");
    boolean result;
    result = wl.isNeighbors("whrrr", "there");
    java.lang.System.out.print(result);
}