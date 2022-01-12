public synchronized void update() throws java.io.IOException, org.eclipse.jgit.api.errors.GitAPIException {
    this.sessionModel.getCurrentRepoHelper().updateModel();
    elegit.UpdateModel updates = this.getChanges();
    if (!(updates.hasChanges()))
        return ;
    
    this.addCommitsToTree(updates.getCommitsToAdd());
    this.removeCommitsFromTree(updates.getCommitsToRemove());
    this.updateView();
    this.resetBranchHeads(true);
    elegit.CommitTreeController.setBranchHeads(this, this.sessionModel.getCurrentRepoHelper());
}