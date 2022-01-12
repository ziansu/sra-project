private void printDwithAxiomOrHypo(Node n) {
    out.println(n);
    out.println(((((n + "->") + (alpha)) + "->") + n));
    out.println((((alpha) + "->") + n));
}