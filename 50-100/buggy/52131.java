@java.lang.Override
public void process(java.lang.Object[] args) throws org.apache.hadoop.hive.ql.metadata.HiveException {
    java.util.List<?> features = ((java.util.List<?>) (featureListOI.getList(args[0])));
    hivemall.model.FeatureValue[] featureVector = parseFeatures(features);
    if (featureVector == null) {
        return ;
    }
    int label = org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorUtils.getInt(args[1], labelOI);
    checkLabelValue(label);
    ++(count);
    train(featureVector, label);
}