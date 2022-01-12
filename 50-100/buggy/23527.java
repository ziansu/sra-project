public void perform(final java.lang.String tagName) throws java.io.IOException {
    if (getBuild().hasPermission(Permission.UPDATE)) {
        getBuild().keepLog(true);
    }
    hudson.scm.CvsRevisionState state = getBuild().getAction(hudson.scm.CvsRevisionState.class);
    if (state == null) {
        return ;
    }
    new hudson.scm.cvstagging.CvsTagActionWorker(state, tagName, getBuild(), this).run();
    synchronized(this) {
        tagNames.add(tagName);
    }
}