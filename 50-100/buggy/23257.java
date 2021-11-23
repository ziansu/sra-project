public static java.util.ArrayList<java.lang.String> getWordLadderDFS(java.lang.String start, java.lang.String end) {
    java.util.Set<java.lang.String> dict = assignment3.Main.makeDictionary();
    assignment3.Helper test = new assignment3.Helper(dict);
    java.util.ArrayList<java.lang.String> ladder = new java.util.ArrayList<java.lang.String>();
    if (test.dfsHelper(start, end, ladder)) {
        ladder.add(start);
    }else {
        ladder.add(start);
        ladder.add(end);
    }
    java.util.Collections.reverse(ladder);
    return ladder;
}