@java.lang.Override
public final int calculateValue(final nl.tue.s2id90.draughts.DraughtsState draughtsState, final boolean isWhitePlayer, final int depth) {
    int value = 0;
    for (nl.tue.s2id90.group05.HeuristicComponent component : components) {
        value = component.calculateComponentValue(draughtsState, isWhitePlayer, depth, value);
    }
    return value;
}