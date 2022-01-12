public void adjustBranchLevel(int indicator) {
    this.setLevel(((this.getLevel()) + indicator));
    for (com.storii.models.InternLink link : this.getOutgoingInternLinks()) {
        link.getNextPage().adjustBranchLevel(indicator);
    }
}