private com.thoughtworks.go.domain.materials.git.GitCommand getGit(java.io.File workingdir) {
    com.thoughtworks.go.util.command.InMemoryStreamConsumer output = com.thoughtworks.go.util.command.ProcessOutputStreamConsumer.inMemoryConsumer();
    try {
        return git(output, workingdir);
    } catch (java.lang.Exception e) {
        throw bomb((((e.getMessage()) + " ") + (output.getStdError())), e);
    }
}