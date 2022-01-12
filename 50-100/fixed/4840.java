public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.io.IOException {
    try {
        int i = java.lang.Integer.parseInt(args[0]);
        java.lang.System.out.println(("k=" + i));
        automapreduct.Automaton a = new automapreduct.Automaton();
        a.loadFromFile("InputAuto.txt");
        automapreduct.DirectedGraph sdf = a.makeGraph(i);
        sdf.makeFile("graph.dot", i);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}