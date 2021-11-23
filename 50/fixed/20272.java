@org.junit.Test
public void testIncrementUpperM() {
    Graph graph = new Graph("scc6.txt");
    for (int m = 1000; m <= 2000; m += 10) {
        Cycles c = new Cycles(graph);
        c.getCycles(m);
    }
}