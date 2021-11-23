public void addDeletion(java.lang.String path, de.setsoftware.reviewtool.model.changestructure.Revision revision, de.setsoftware.reviewtool.model.changestructure.Repository repo) {
    final de.setsoftware.reviewtool.model.changestructure.FileInRevision file = de.setsoftware.reviewtool.model.changestructure.ChangestructureFactory.createFileInRevision(path, revision, repo);
    assert (this.getNodeForExactRevision(file)) == null;
    this.index.put(this.createKey(file), new de.setsoftware.reviewtool.changesources.svn.FileHistoryGraph.FileHistoryNode(file));
}