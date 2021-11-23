static void notifyListeners(kanzi.io.BlockListener[] listeners, kanzi.io.BlockEvent evt) {
    for (kanzi.io.BlockListener bl : listeners) {
        try {
            bl.processEvent(evt);
        } catch (java.lang.Exception e) {
        }
    }
}