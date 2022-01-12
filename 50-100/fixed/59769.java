@java.lang.Override
public boolean goBack() {
    com.nhaarman.triad.Preconditions.checkState((((backstack.size()) > 0) || ((transition) != null)), "Use startWith(Screen) to show your first Screen.");
    boolean canGoBack = ((backstack.size()) > 0) || (((transition) != null) && (transition.isFinished()));
    move(new com.nhaarman.triad.TriadImpl.GoBackTransition());
    return canGoBack;
}