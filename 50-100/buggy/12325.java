private gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype getDataType(java.lang.String name) {
    org.springframework.data.mongodb.core.query.Criteria where = org.springframework.data.mongodb.core.query.Criteria.where("scope").is(Constant.SCOPE.HL7STANDARD).and("hl7Version").is(hl7Version).and("name").is(name);
    org.springframework.data.mongodb.core.query.Query qry = org.springframework.data.mongodb.core.query.Query.query(where);
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype dt = mongoOps.findOne(qry, gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Datatype.class);
    return dt;
}