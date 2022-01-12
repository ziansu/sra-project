@java.lang.Override
Responses.ExecuteResponse serialize() {
    org.apache.calcite.avatica.proto.Responses.ExecuteResponse.Builder builder = Responses.ExecuteResponse.newBuilder();
    if (null != (results)) {
        for (org.apache.calcite.avatica.remote.Service.ResultSetResponse result : results) {
            builder.addResults(result.serialize());
        }
    }
    if (null != (rpcMetadata)) {
        builder.setMetadata(rpcMetadata.serialize());
    }
    return builder.setMissingStatement(missingStatement).build();
}