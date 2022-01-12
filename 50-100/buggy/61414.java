@java.lang.Override
void wrapUp(org.kohsuke.github.GitHub root) {
    super.wrapUp(root);
    if ((pull_request) == null)
        throw new java.lang.IllegalStateException("Expected pull_request payload, but got something else. Maybe we've got another type of event?");
    
    if ((repository) != null) {
        repository.wrap(root);
        pull_request.wrap(repository);
    }else {
        pull_request.wrapUp(root);
    }
}