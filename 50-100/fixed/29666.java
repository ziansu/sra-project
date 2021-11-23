private void removeCommitFromTree(elegit.CommitHelper commitHelper, elegit.TreeGraphModel graphModel) {
    java.lang.String commitID = elegit.RepoHelper.getCommitId(commitHelper);
    this.commitsInModel.remove(commitHelper);
    this.localCommitsInModel.remove(commitHelper);
    this.remoteCommitsInModel.remove(commitHelper);
    if (graphModel.containsID(commitID))
        graphModel.removeCell(commitID);
    
}