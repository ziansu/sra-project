@java.lang.Override
public com.fasterxml.jackson.databind.JsonNode getBodyJson() {
    com.fasterxml.jackson.databind.node.ArrayNode node = JsonNodeFactory.instance.arrayNode();
    for (com.redhat.lightblue.client.request.BulkLightblueDataRequest.Sequence seq : seqs) {
        com.fasterxml.jackson.databind.node.ObjectNode seqNode = JsonNodeFactory.instance.objectNode();
        seqNode.set("seq", com.redhat.lightblue.client.util.JSON.toJsonNode(seq.seq));
        seqNode.set("op", com.redhat.lightblue.client.util.JSON.toJsonNode(seq.request.getOperationPathParam()));
        seqNode.set("request", seq.request.getBodyJson());
        node.add(seqNode);
    }
    return node;
}