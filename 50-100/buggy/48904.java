private Points.Point pointFromColumn(com.rackspacecloud.blueflood.io.Column<java.lang.Long> column, com.rackspacecloud.blueflood.rollup.Granularity gran, com.netflix.astyanax.serializers.AbstractSerializer serializer) {
    if (serializer instanceof com.rackspacecloud.blueflood.io.serializers.NumericSerializer.RawSerializer)
        return new com.rackspacecloud.blueflood.io.Points.Point(column.getName(), new com.rackspacecloud.blueflood.io.SimpleNumber(column.getValue(serializer)));
    else
        return new com.rackspacecloud.blueflood.io.Points.Point(column.getName(), column.getValue(serializer));
    
}