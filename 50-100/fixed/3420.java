public static long getConstLong(@javax.annotation.Nonnull
final org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    if (!(hivemall.utils.hadoop.HiveUtils.isBigIntOI(oi))) {
        throw new org.apache.hadoop.hive.ql.exec.UDFArgumentException(("argument must be a BigInt value: " + (org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils.getTypeInfoFromObjectInspector(oi))));
    }
    org.apache.hadoop.io.LongWritable v = hivemall.utils.hadoop.HiveUtils.getConstValue(oi);
    return v.get();
}