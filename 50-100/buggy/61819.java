@java.lang.Override
public com.fasterxml.jackson.databind.JsonNode getHSAInfo(se.inera.statistics.service.hsa.HSAKey key) {
    com.fasterxml.jackson.databind.node.ObjectNode root = factory.objectNode();
    root.put("enhet", createEnhet(key));
    if (!("EJHSA".equals(key.getEnhetId()))) {
        root.put("huvudenhet", createEnhet(key));
        root.put("vardgivare", createVardgivare(key));
    }
    root.put("personal", getOrCreatePersonal(key));
    return root;
}