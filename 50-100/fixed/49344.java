private void printDwithAxiomOrHypo(Node n) {
    out.println(n);
    if ((alpha) == null)
        return ;
    
    out.println(((((n + "->") + (alpha)) + "->") + n));
    out.println((((alpha) + "->") + n));
}