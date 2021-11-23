@java.lang.Override
public void onPreReceive(final org.eclipse.jgit.transport.ReceivePack rp, final java.util.Collection<org.eclipse.jgit.transport.ReceiveCommand> commands) {
    fs.lock();
    if ((clusterService) != null) {
        clusterService.lock();
    }
    for (final org.eclipse.jgit.transport.ReceiveCommand command : commands) {
        final org.eclipse.jgit.revwalk.RevCommit lastCommit = org.uberfire.java.nio.fs.jgit.util.JGitUtil.getLastCommit(fs.gitRepo(), command.getRefName());
        oldTreeRefs.put(command.getRefName(), lastCommit);
    }
}