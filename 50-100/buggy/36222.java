public static boolean getConstBoolean(@javax.annotation.Nonnull
final org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    if (!(hivemall.utils.hadoop.HiveUtils.isBooleanOI(oi))) {
        throw new org.apache.hadoop.hive.ql.exec.UDFArgumentException(("argument must be a Boolean value: " + (org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils.getTypeInfoFromObjectInspector(oi))));
    }
    org.apache.hadoop.io.BooleanWritable v = hivemall.utils.hadoop.HiveUtils.getConstValue(oi);
    return v == null ? null : v.get();
}