public int deleteMappings(java.lang.String serviceName, java.lang.String accession) {
    serviceName = org.apache.commons.lang.StringUtils.trimToNull(serviceName);
    if (serviceName == null)
        return 0;
    
    accession = org.apache.commons.lang.StringUtils.trimToNull(accession);
    if (accession == null)
        return 0;
    
    java.lang.String bundle = this.findBundle(serviceName, accession);
    return bundle == null ? 0 : this.deleteBundle(bundle);
}