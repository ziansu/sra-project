public java.util.List<Value> query2D(com.grid.structs.geo.Interval2D rect) {
    final java.util.List<Value> results = com.google.common.collect.Lists.newArrayList();
    query2D(root, rect, results);
    return results;
}