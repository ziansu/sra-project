private java.lang.String getJsonFieldName(com.dnastack.bob.persistence.entity.Beacon b) {
    java.lang.String res;
    if (b.getId().startsWith(com.dnastack.bob.service.parser.impl.JsonCafeResponseParser.BEACON_PREFIX)) {
        res = ((b.getId().substring(com.dnastack.bob.service.parser.impl.JsonCafeResponseParser.BEACON_PREFIX.length())) + "_") + (com.dnastack.bob.service.parser.impl.JsonCafeResponseParser.RESPONSE_FIELD);
    }else {
        res = ((b.getId()) + "_") + (com.dnastack.bob.service.parser.impl.JsonCafeResponseParser.RESPONSE_FIELD);
    }
    return res;
}