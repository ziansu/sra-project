public void updateTo(com.thoughtworks.go.util.command.ProcessOutputStreamConsumer outputStreamConsumer, com.thoughtworks.go.config.materials.git.Revision revision, java.io.File baseDir, final com.thoughtworks.go.config.materials.SubprocessExecutionContext execCtx) {
    try {
        outputStreamConsumer.stdOutput(java.lang.String.format("[%s] Start updating %s at revision %s from %s", GoConstants.PRODUCT_NAME, updatingTarget(), revision.getRevision(), url));
        com.thoughtworks.go.domain.materials.git.GitCommand git = git(outputStreamConsumer, workingdir(baseDir));
        git.fetchAndReset(outputStreamConsumer, revision);
        outputStreamConsumer.stdOutput(java.lang.String.format("[%s] Done.\n", GoConstants.PRODUCT_NAME));
    } catch (java.lang.Exception e) {
        bomb(e);
    }
}