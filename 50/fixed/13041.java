private void finish() {
    if (!(isTracing())) {
        return ;
    }
    currentSpan().logEvent(Span.CLIENT_RECV);
    this.tracer.close(currentSpan());
}