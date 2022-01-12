private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getStandards(java.lang.Integer codeId, java.lang.String[] rootNodeId) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> codes = this.getSubdomainRepository().getStandards(codeId, rootNodeId);
    for (java.util.Map<java.lang.String, java.lang.Object> code : codes) {
        code.put(org.ednovo.gooru.domain.service.subdomain.NODE, this.getSubdomainRepository().getStandards(((java.lang.Number) (code.get(org.ednovo.gooru.domain.service.subdomain.CODE_ID))).intValue(), rootNodeId));
    }
    return codes;
}