public void calculate() {
    system.Continuation c = ((system.Continuation) (closure.getArgument(0)));
    task.TaskTsp.Wrapper w = ((task.TaskTsp.Wrapper) (c.argument));
    bruteForce(new java.util.ArrayList() {
        {
            addAll(w.PATH);
            addAll(w.UNUSED);
        }
    }, w.PATH.size());
    c.setReturnVal(new system.ResultValueWrapper(best, shortest));
    sendArgument(c);
}