@org.springframework.transaction.annotation.Transactional
public java.util.List<org.mskcc.cbio.portal.model.DBSample> getSamplesBySample(java.lang.String study_id, java.util.List<java.lang.String> sample_ids) {
    return sampleMapper.getSamplesBySample(study_id, sample_ids);
}