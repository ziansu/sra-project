public static java.util.ArrayList<java.lang.String> getWordLadderDFS(java.lang.String start, java.lang.String end) {
    assignment3.Main.words[0] = start.toUpperCase();
    assignment3.Main.words[1] = end.toUpperCase();
    assignment3.Main.ladder.clear();
    assignment3.Main.visited.clear();
    if (assignment3.Main.DFS(assignment3.Main.words[0], assignment3.Main.words[1])) {
        assignment3.Main.ladder.add(start);
    }
    java.util.Collections.reverse(assignment3.Main.ladder);
    return assignment3.Main.ladder;
}