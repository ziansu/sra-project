public void addDelta(mmdanggg2.cste.util.BlockDelta bd) {
    if ((history.size()) == 0) {
        history.add(new java.util.ArrayList<mmdanggg2.cste.util.BlockDelta>());
    }
    java.util.ArrayList<mmdanggg2.cste.util.BlockDelta> currHistory = history.get(((history.size()) - 1));
    currHistory.add(bd);
}