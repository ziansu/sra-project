@java.lang.Override
public gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.ExportConfig findOneByTypeAndAccountId(java.lang.String type, java.lang.Long accountId) {
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.ExportConfig exportConfig = null;
    try {
        exportConfig = exportConfigRepository.findOneByTypeAndAccountId(type, accountId);
    } catch (java.lang.Exception e) {
        gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportConfigServiceImpl.logger.warn(((("Could not find a configuration for account " + accountId) + " with the type ") + type));
    }
    return exportConfig;
}