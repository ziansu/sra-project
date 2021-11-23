@org.springframework.transaction.annotation.Transactional
public int addNewSittingToAssessment(java.lang.Long assessmentId, java.lang.Long treatmentId) {
    com.bharatonjava.therapymanager.domain.Treatment t = this.prescriptionDao.getTreatment(treatmentId);
    com.bharatonjava.therapymanager.domain.Sitting s = new com.bharatonjava.therapymanager.domain.Sitting();
    s.setAssessmentId(assessmentId);
    s.setFees(t.getFees());
    s.setTreatment(t.getName());
    s.setCreatedDate(new java.util.Date());
    int count = this.patientDao.addNewSittingToAssessment(s);
    return count;
}