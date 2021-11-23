@java.lang.Override
public void configure(java.lang.String fieldNameForThisInstance, java.util.Map<java.lang.String, java.lang.String> properties, org.apache.hadoop.conf.Configuration configuration) {
    _ctx = com.spatial4j.core.context.SpatialContext.GEO;
    boolean docValue = false;
    if ((properties.get(org.apache.blur.analysis.type.spatial.SpatialTermQueryPrefixTreeStrategyFieldTypeDefinition.DOC_VALUE)) != null) {
        docValue = true;
    }
    _grid = getSpatialPrefixTree(properties);
    _strategy = new org.apache.blur.analysis.type.spatial.lucene.TermQueryPrefixTreeStrategy(_grid, fieldNameForThisInstance, docValue);
    _shapeReadWriter = new org.apache.blur.analysis.type.spatial.ShapeReadWriter<com.spatial4j.core.context.SpatialContext>(_ctx);
    addSupportedIndexedShapes(com.spatial4j.core.shape.Point.class);
    addSupportedOperations(SpatialOperation.Intersects);
}