public void printProblem(Kattio io) {
    io.println((((X.length) + " ") + (Y.length)));
    io.println(E.numEdges);
    for (int x = 0; x < (E.edges.length); x++) {
        for (Edge y : E.listByX(x)) {
            io.println(((x + " ") + (y.y)));
        }
    }
    io.flush();
}