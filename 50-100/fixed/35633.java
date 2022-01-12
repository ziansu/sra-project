@java.lang.Override
public int calculateComponentValue(final nl.tue.s2id90.draughts.DraughtsState draughtsState, final boolean isWhitePlayer, final int depth, final int currentHeuristicValue) {
    if (currentHeuristicValue > 0) {
        return -depth;
    }else
        if (currentHeuristicValue < 0) {
            return depth;
        }else {
            return 0;
        }
    
}