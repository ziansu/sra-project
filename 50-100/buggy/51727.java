public void adjustBranchLevel(int indicator) {
    this.setLevel(((this.getLevel()) + indicator));
    java.lang.System.out.println(this.getId());
    for (com.storii.models.InternLink link : this.getOutgoingInternLinks()) {
        link.getNextPage().adjustBranchLevel(indicator);
    }
}