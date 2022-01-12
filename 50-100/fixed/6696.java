private void handleDCPRequest(final com.couchbase.client.core.message.dcp.DCPRequest req) {
    if (req instanceof com.couchbase.client.core.message.dcp.MutationMessage) {
        com.couchbase.client.core.message.dcp.MutationMessage msg = ((com.couchbase.client.core.message.dcp.MutationMessage) (req));
        handleMutation(msg, msg.partition());
    }else
        if (req instanceof com.couchbase.client.core.message.dcp.RemoveMessage) {
            com.couchbase.client.core.message.dcp.RemoveMessage msg = ((com.couchbase.client.core.message.dcp.RemoveMessage) (req));
            handleRemove(msg, msg.partition());
        }
    
}