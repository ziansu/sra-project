@java.lang.Override
protected gov.ca.cwds.data.persistence.cms.ReplicatedPersonCases normalizeSingle(java.util.List<gov.ca.cwds.data.persistence.cms.EsPersonCase> recs) {
    return !(recs.isEmpty()) ? normalize(recs).get(0) : null;
}