@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, readOnly = false)
public org.evaluator.ws.model.Submission update(org.evaluator.ws.model.Submission submission) {
    logger.info("> updateSubmission id:{}", submission.getId());
    org.evaluator.ws.model.Submission submissionToUpdate = findOne(submission.getId());
    if (submissionToUpdate == null) {
        logger.error("Attempted to update a Greeting, but the entity does not exist.");
        throw new javax.persistence.NoResultException("Requested entity not found.");
    }
    this.updateExamAndExercise(submissionToUpdate);
    submission.setStatus("C");
    org.evaluator.ws.model.Submission updatedSubmission = submissionRepository.save(submission);
    logger.info("< updateSubmission id:{}", updatedSubmission.getId());
    return updatedSubmission;
}