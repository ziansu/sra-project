protected java.util.List<com.orientechnologies.orient.server.distributed.ODistributedResponse> getReceivedResponses() {
    final java.util.List<com.orientechnologies.orient.server.distributed.ODistributedResponse> parsed = new java.util.ArrayList<com.orientechnologies.orient.server.distributed.ODistributedResponse>();
    for (java.lang.Object r : responses.values())
        if (r != (com.orientechnologies.orient.server.distributed.ODistributedResponseManager.NO_RESPONSE))
            parsed.add(((com.orientechnologies.orient.server.distributed.ODistributedResponse) (r)));
        
    
    return parsed;
}