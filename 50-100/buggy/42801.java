protected void checkParameterOI(org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[] argOIs) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    if ((argOIs.length) != 1) {
        throw new org.apache.hadoop.hive.ql.exec.UDFArgumentException("HiveImporter UDTF takes 1 argument: STRING");
    }
    org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector arg1 = argOIs[0];
    if (!(arg1 instanceof org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector)) {
        throw new org.apache.hadoop.hive.ql.exec.UDFArgumentException("HiveImporter UDTF takes 1 argument: STRING");
    }
    this.stringOI = ((org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector) (arg1));
    this.parser = new info.pavie.osm2hive.controller.OSMParser();
}