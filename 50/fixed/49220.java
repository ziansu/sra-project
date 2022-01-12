public synchronized void push(org.eclipse.equinox.http.servlet.internal.context.DispatchTargets toPush) {
    toPush.addRequestParameters(request);
    this.dispatchTargets.push(toPush);
}