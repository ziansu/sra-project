private void applyDelta(org.pravus.qpojo.util.DocumentTemplate documentHandler, difflib.Delta<java.lang.Character> delta) {
    switch (delta.getType()) {
        case CHANGE :
            applyDeleteDelta(documentHandler, delta);
            applyInsertDelta(documentHandler, delta);
            break;
        case DELETE :
            applyDeleteDelta(documentHandler, delta);
            break;
        case INSERT :
            applyInsertDelta(documentHandler, delta);
            break;
    }
}