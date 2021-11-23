public void notifyStateUpdate(P param) {
    final java.util.List<S> states = getForegroundStates(null);
    if (states != null) {
        for (S s : states) {
            s.onUpdate(param);
        }
    }
}