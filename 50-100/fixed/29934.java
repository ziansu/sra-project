public void setDisplayValues(java.util.List<application.Wrapper> list, java.lang.String key) {
    for (application.Wrapper wrapper : list) {
        multimap.putAll(wrapper.getMultimap());
        table.putAll(wrapper.getTable());
    }
    java.util.Map<java.lang.String, org.apache.commons.math3.stat.descriptive.SummaryStatistics> map = table.row(key);
    java.util.Collection<org.apache.commons.math3.stat.descriptive.SummaryStatistics> collection = map.values();
    aggregate = org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.aggregate(collection);
    this.key = key;
}