@java.lang.Override
protected void consume(E item) {
    com.psddev.dari.db.State state = com.psddev.dari.db.State.getInstance(item);
    if (copyAny(state.getValues(), source, destination)) {
        states.add(com.psddev.dari.db.State.getInstance(item));
        if ((states.size()) == (commitSize)) {
            commit();
        }
    }
}