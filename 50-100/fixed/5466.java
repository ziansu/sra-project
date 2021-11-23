private void setTraversingState(@android.support.annotation.NonNull
com.solera.defrag.TraversingState traversing) {
    if ((traversing != (TraversingState.IDLE)) && ((traversingState) != (TraversingState.IDLE))) {
        throw new java.lang.IllegalStateException("ViewStack is currently traversing");
    }
    traversingState = traversing;
    for (com.solera.defrag.ViewStackListener listener : new java.util.ArrayList(viewStackListeners)) {
        listener.onTraversing(traversingState);
    }
}