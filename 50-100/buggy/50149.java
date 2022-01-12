void merge(joshua.decoder.hypergraph.WordAlignmentState astate) {
    if (((astate.isComplete()) && ((stack.size()) > 0)) && (!(stack.peek().isComplete()))) {
        joshua.decoder.hypergraph.WordAlignmentState parentState = stack.pop();
        parentState.substituteIn(astate);
        merge(parentState);
    }else {
        stack.add(astate);
    }
}