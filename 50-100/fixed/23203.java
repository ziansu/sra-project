public gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype findByNameAndVesionAndScope(java.lang.String name, java.lang.String hl7Version, java.lang.String scope) {
    org.springframework.data.mongodb.core.query.BasicQuery query1 = new org.springframework.data.mongodb.core.query.BasicQuery((((((("{ name : '" + name) + "', hl7Version : '") + hl7Version) + "', scope : '") + scope) + "'}"));
    return mongoOps.findOne(query1, gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype.class);
}