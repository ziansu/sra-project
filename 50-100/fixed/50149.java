private void merge(final joshua.decoder.hypergraph.WordAlignmentState state) {
    if (((!(stack.isEmpty())) && (state.isComplete())) && (!(stack.peek().isComplete()))) {
        final joshua.decoder.hypergraph.WordAlignmentState parentState = stack.pop();
        parentState.substituteIn(state);
        merge(parentState);
    }else {
        stack.add(state);
    }
}