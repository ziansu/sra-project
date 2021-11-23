public void addChildContext(java.lang.String childContextName, gobblin.metrics.MetricContext childContext) {
    if ((this.children.asMap().putIfAbsent(childContextName, childContext)) != null) {
        throw new java.lang.IllegalArgumentException((("A child context named " + childContextName) + " already exists"));
    }
}