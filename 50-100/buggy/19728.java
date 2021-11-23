@java.lang.Override
protected void doExecute() {
    if ((history.size()) == 1) {
        onTraversalCompleted();
    }else {
        flow.History.Builder builder = history.buildUpon();
        builder.pop();
        flow.History newHistory = builder.build();
        dispatch(newHistory, flow.Flow.Direction.BACKWARD);
    }
}