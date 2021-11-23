@java.lang.Override
public void getContext(aau.carma.ContextEngine.ContextProviderListener listener) {
    logCurrentOutcomes();
    listener.onContextReady(this.outcomes);
}