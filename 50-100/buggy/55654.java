private static java.nio.ByteBuffer executeInternal(int protocolVersion, org.apache.cassandra.cql3.functions.ScalarFunction fun, java.util.List<java.nio.ByteBuffer> params) throws org.apache.cassandra.exceptions.InvalidRequestException {
    java.nio.ByteBuffer result = fun.execute(protocolVersion, params);
    try {
        if (result != null)
            fun.returnType().validate(result);
        
        return result;
    } catch (org.apache.cassandra.serializers.MarshalException e) {
        throw new java.lang.RuntimeException(java.lang.String.format("Return of function %s (%s) is not a valid value for its declared return type %s", fun.name(), org.apache.cassandra.utils.ByteBufferUtil.bytesToHex(result), fun.returnType().asCQL3Type()), e);
    }
}