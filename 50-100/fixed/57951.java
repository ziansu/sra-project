@java.lang.Override
public org.springframework.batch.repeat.RepeatStatus execute(final org.springframework.batch.core.StepContribution contribution, final org.springframework.batch.core.scope.context.ChunkContext chunkContext) throws java.lang.Exception {
    for (final org.opentestsystem.rdw.ingest.common.model.ImportContent supportedContent : supportedContents) {
        if (getJobBatch(chunkContext).getImportContent().contains(supportedContent)) {
            repository.execute(sqlCopyStatements, getJobBatch(chunkContext));
            return org.springframework.batch.repeat.RepeatStatus.FINISHED;
        }
    }
    return org.springframework.batch.repeat.RepeatStatus.FINISHED;
}