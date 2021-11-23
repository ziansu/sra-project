public void floodfill(aiproj.lukemason.Move m) {
    dead.clear();
    findNextUp(m.P, m.Row, m.Col);
    findNextDown(m.P, m.Row, m.Col);
    findNextLeft(m.P, m.Row, m.Col);
    findNextRight(m.P, m.Row, m.Col);
}