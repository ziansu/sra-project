@org.springframework.transaction.annotation.Transactional
public org.egov.tl.entity.DemandGenerationLogDetail createOrGetDemandGenerationLogDetail(org.egov.tl.entity.DemandGenerationLog demandGenerationLog, org.egov.tl.entity.License license) {
    org.egov.tl.entity.DemandGenerationLogDetail logDetail = demandGenerationLogDetailRepository.findByDemandGenerationLogIdAndLicenseId(demandGenerationLog.getId(), license.getId());
    if (logDetail == null) {
        logDetail = new org.egov.tl.entity.DemandGenerationLogDetail();
        logDetail.setLicense(license);
        logDetail.setDemandGenerationLog(demandGenerationLog);
        logDetail.setStatus(ProcessStatus.INPROGRESS);
        demandGenerationLog.getDetails().add(logDetail);
    }
    return logDetail;
}