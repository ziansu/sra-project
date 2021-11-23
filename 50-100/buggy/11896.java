private void saveEntry(org.owasp.dependencycheck.dependency.Vulnerability vuln) throws java.io.IOException, org.apache.lucene.index.CorruptIndexException, org.owasp.dependencycheck.data.nvdcve.DatabaseException {
    if ((cveDB) == null) {
        return ;
    }
    final java.lang.String cveName = vuln.getName();
    if (prevVersionVulnMap.containsKey(cveName)) {
        final java.util.List<org.owasp.dependencycheck.dependency.VulnerableSoftware> vulnSoftware = prevVersionVulnMap.get(cveName);
        for (org.owasp.dependencycheck.dependency.VulnerableSoftware vs : vulnSoftware) {
            vuln.updateVulnerableSoftware(vs);
        }
    }
    cveDB.updateVulnerability(vuln);
}