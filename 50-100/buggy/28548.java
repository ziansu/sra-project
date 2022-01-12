private void addTable(gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Table vsd, gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Profile pSource, gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Profile pTarget) {
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.TableLibrary vsdSource = pTarget.getTableLibrary();
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.TableLibrary vsdTarget = pTarget.getTableLibrary();
    if ((gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Constant.SCOPE.USER) == (vsd.getScope())) {
        vsd.setId(null);
        vsd.getLibIds().remove(vsdSource.getId());
        vsd.getLibIds().add(vsdTarget.getId());
        tableRepository.save(vsd);
    }
    vsdTarget.addTable(vsd);
}