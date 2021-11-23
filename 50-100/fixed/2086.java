@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj instanceof act.metric.MetricInfo) {
        act.metric.MetricInfo that = ((act.metric.MetricInfo) (obj));
        return $.eq(name, that.name);
    }
    return false;
}