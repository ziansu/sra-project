@java.lang.Override
void doExecute() {
    if ((history.size()) <= 1) {
        return ;
    }
    flow.History.Builder builder = history.buildUpon();
    builder.pop();
    final flow.History newHistory = builder.build();
    dispatch(newHistory, flow.Flow.Direction.BACKWARD);
}