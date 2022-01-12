public elegit.UpdateModel getChanges() {
    elegit.UpdateModel updateModel = new elegit.UpdateModel();
    java.util.List<elegit.CommitHelper> commitsToAdd = new java.util.ArrayList(this.getAllCommits());
    commitsToAdd.removeAll(this.getCommitsInModel());
    updateModel.setCommitsToAdd(commitsToAdd);
    java.util.List<elegit.CommitHelper> commitsToRemove = new java.util.ArrayList(this.commitsInModel);
    commitsToRemove.removeAll(this.getAllCommits());
    updateModel.setCommitsToRemove(commitsToRemove);
    return updateModel;
}