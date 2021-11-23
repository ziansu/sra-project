protected java.util.List<com.orientechnologies.orient.server.distributed.ODistributedResponse> getConflictResponses() {
    final java.util.List<com.orientechnologies.orient.server.distributed.ODistributedResponse> servers = new java.util.ArrayList<com.orientechnologies.orient.server.distributed.ODistributedResponse>();
    int bestGroupSoFar = getBestResponsesGroup();
    for (int i = 0; i < (responseGroups.size()); ++i) {
        if (i != bestGroupSoFar) {
            for (com.orientechnologies.orient.server.distributed.ODistributedResponse r : responseGroups.get(i))
                servers.add(r);
            
        }
    }
    return servers;
}