private int getPermutation(acx.lam.HashMaglev16Balancer.CellState state) {
    char c = state.row[state.nextPos];
    if (c == 0) {
        if ((state.nextPos) == 0) {
            return state.offset;
        }
        int perm = ((state.last) + (state.skip)) % (mSizeLookup);
        state.last = perm;
        state.row[state.nextPos] = ((char) (perm + 1));
        return perm;
    }
    state.last = c - 1;
    return state.last;
}