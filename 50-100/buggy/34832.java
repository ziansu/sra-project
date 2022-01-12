public static void readInDocFromPointable(org.apache.hyracks.data.std.primitive.UTF8StringPointable stringp, org.apache.hyracks.dataflow.common.comm.util.ByteBufferInputStream bbis, java.io.DataInputStream di, org.apache.hyracks.data.std.util.ArrayBackedValueStorage abvs, org.apache.vxquery.xmlparser.IParser parser) throws java.io.IOException, java.lang.NumberFormatException, org.apache.htrace.fasterxml.jackson.core.JsonParseException {
    java.lang.String fName;
    try {
        fName = org.apache.vxquery.runtime.functions.util.FunctionHelper.getStringFromPointable(stringp, bbis, di);
    } catch (org.apache.vxquery.exceptions.SystemException e) {
        throw new org.apache.hyracks.api.exceptions.HyracksDataException(e);
    }
    org.apache.vxquery.runtime.functions.util.FunctionHelper.readInDocFromString(fName, bbis, di, abvs, parser);
}