public void changeCategory() {
    this.outlinePage.setCategory(this.getEditDomain(), this.getGraphicalViewer(), this.getActionRegistry());
    this.getSelectionSynchronizer().addViewer(this.outlinePage.getViewer());
}