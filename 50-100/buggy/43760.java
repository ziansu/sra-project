@java.lang.Override
public void execute() {
    if ((backstack.size()) == 1) {
        onComplete();
    }else {
        com.nhaarman.triad.Backstack.Builder builder = backstack.buildUpon();
        com.nhaarman.triad.Backstack.Entry<?> entry = com.nhaarman.triad.Preconditions.checkNotNull(builder.pop(), "Popped entry is null.");
        com.nhaarman.triad.Backstack newBackstack = builder.build();
        notifyScreenPopped(entry.screen);
        notifyBackward(newBackstack, entry.animator);
    }
}