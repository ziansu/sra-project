public static void readInDocFromPointable(org.apache.hyracks.data.std.primitive.UTF8StringPointable stringp, org.apache.hyracks.dataflow.common.comm.util.ByteBufferInputStream bbis, java.io.DataInputStream di, org.apache.hyracks.data.std.util.ArrayBackedValueStorage abvs, org.apache.vxquery.xmlparser.IParser parser) throws java.io.IOException {
    java.lang.String fName = org.apache.vxquery.runtime.functions.util.FunctionHelper.getStringFromPointable(stringp, bbis, di);
    org.apache.vxquery.runtime.functions.util.FunctionHelper.readInDocFromString(fName, bbis, di, abvs, parser);
}