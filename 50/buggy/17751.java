@java.lang.Override
public void createExam(hu.schonherz.training.exam.vo.ExamVo examVo) {
    try {
        examRepository.saveAndFlush(hu.schonherz.training.exam.service.mapper.ExamMapper.toDto(examVo));
    } catch (java.lang.Exception ex) {
        hu.schonherz.training.exam.service.impl.ExamServiceImpl.logger.error(ex.getMessage(), ex);
    }
}