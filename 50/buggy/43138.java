private boolean isPullRequest(hudson.model.Job job) {
    jenkins.scm.api.SCMHead head = SCMHead.HeadByItem.findHead(job);
    return (head != null) && ((head.getAction(jenkins.scm.api.actions.ChangeRequestAction.class)) != null);
}