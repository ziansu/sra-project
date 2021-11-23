public com.radiance.kamisado.MoveGroup reverse() {
    com.radiance.kamisado.MoveGroup reversed = new com.radiance.kamisado.MoveGroup(counter);
    for (int i = (moves.size()) - 1; i >= 0; i--) {
        reversed.add(moves.get(i).reverse());
    }
    return reversed;
}