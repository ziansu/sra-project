public void addChildContext(java.lang.String childContextName, gobblin.metrics.MetricContext childContext) {
    this.children.asMap().putIfAbsent(childContextName, childContext);
}