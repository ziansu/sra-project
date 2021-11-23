private java.lang.Integer fetchDomainIdFromName(java.lang.String domainName) {
    java.lang.Integer domainId = 0;
    oracle.jbo.ViewObject domainVO = this.getDomainVO();
    domainVO.setWhereClause((("DOMAIN_NAME = '" + domainName) + "'"));
    domainVO.executeQuery();
    if ((domainVO.getEstimatedRowCount()) > 0) {
        domainId = ((java.lang.Integer) (domainVO.first().getAttribute("DomainId")));
    }
    return domainId;
}