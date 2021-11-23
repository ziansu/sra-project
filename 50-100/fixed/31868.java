@org.springframework.transaction.annotation.Transactional(rollbackFor = { java.lang.Exception.class })
public uk.gov.nhs.digital.telehealth.clinician.service.domain.AttributeThreshold getAttributeThreshold(final java.lang.String patientUUID, final java.lang.String attributeName) throws com.dev.ops.exceptions.impl.DefaultWrappedException {
    final uk.gov.nhs.digital.telehealth.clinician.service.entities.AttributeThresholdMaster attributeThresholdMaster = this.attributeThresholdDAO.fetchLatestAttributeThreshold(patientUUID, attributeName);
    uk.gov.nhs.digital.telehealth.clinician.service.domain.AttributeThreshold attributeThreshold = null;
    if (null != attributeThresholdMaster) {
        attributeThreshold = this.mapperFacade.map(attributeThresholdMaster, uk.gov.nhs.digital.telehealth.clinician.service.domain.AttributeThreshold.class);
    }else {
    }
    return attributeThreshold;
}