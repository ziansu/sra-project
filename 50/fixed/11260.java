public void setContents(java.lang.String contents, java.lang.String updatedBy) {
    this.revisions.add(0, new edu.caltech.cs141b.collaborator.server.data.DocumentRevisionData(contents, updatedBy));
}