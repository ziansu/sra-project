public boolean violatesUTIR(sneps.Nodes.MolecularNode node, sneps.match.Substitutions bindings) {
    sneps.Nodes.NodeSet terms = getTerms(node, false);
    return violatesUTIR(terms, bindings);
}