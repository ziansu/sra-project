public static int getConstInt(@javax.annotation.Nonnull
final org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    if (!(hivemall.utils.hadoop.HiveUtils.isIntOI(oi))) {
        throw new org.apache.hadoop.hive.ql.exec.UDFArgumentException(("argument must be a Int value: " + (org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils.getTypeInfoFromObjectInspector(oi))));
    }
    org.apache.hadoop.io.IntWritable v = hivemall.utils.hadoop.HiveUtils.getConstValue(oi);
    return v == null ? null : v.get();
}