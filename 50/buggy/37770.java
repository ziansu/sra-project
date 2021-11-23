public synchronized void pop() {
    this.dispatchTargets.pop();
    this.parameterMap = null;
    getParameterMap();
}