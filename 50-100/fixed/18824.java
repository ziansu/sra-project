public java.util.List<joshua.decoder.segment_file.Token> getTokens() {
    assert isLinearChain();
    java.util.List<joshua.decoder.segment_file.Token> tokens = new java.util.ArrayList<joshua.decoder.segment_file.Token>();
    for (joshua.lattice.Node<joshua.decoder.segment_file.Token> node : getLattice().getNodes())
        if ((node != null) && ((node.getOutgoingArcs().size()) > 0))
            tokens.add(node.getOutgoingArcs().get(0).getLabel());
        
    
    return tokens;
}