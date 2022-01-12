public void floodfill(aiproj.lukemason.Move m) {
    dead.clear();
    findNextUp(m.P, m.Row, m.Col);
    update(this);
    dead.clear();
    findNextDown(m.P, m.Row, m.Col);
    update(this);
    dead.clear();
    findNextLeft(m.P, m.Row, m.Col);
    update(this);
    dead.clear();
    findNextRight(m.P, m.Row, m.Col);
    update(this);
    dead.clear();
}