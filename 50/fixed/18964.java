public java.util.List<com.exam.common.entity.ExamExaminationPaperEntity> findByexam(java.lang.String examinationId) {
    return findBy("examinationId", examinationId, false);
}