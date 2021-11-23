@java.lang.Override
com.youtube.vitess.proto.Query.QueryResult getResult(com.youtube.vitess.proto.Vtgate.StreamExecuteShardsResponse response) throws com.youtube.vitess.client.VitessException {
    return response.getResult();
}