public static org.apache.kylin.measure.MeasureType<?> create(java.lang.String funcName, org.apache.kylin.metadata.datatype.DataType dataType) {
    funcName = funcName.toUpperCase();
    org.apache.kylin.measure.MeasureTypeFactory<?> factory = org.apache.kylin.measure.MeasureTypeFactory.factories.get(org.apache.kylin.common.util.Pair.newPair(funcName, dataType.getName()));
    if (factory == null)
        factory = org.apache.kylin.measure.MeasureTypeFactory.defaultFactory;
    
    return factory.createMeasureType(funcName, dataType);
}