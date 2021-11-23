private void update() {
    clear();
    allContentTagView.getItems().addAll(pastaViewController.getPastaManager().getTagList());
    allAssignTagView.getItems().addAll(pastaViewController.getPastaManager().getAssignmentTagList());
    allAssignTagView.getItems().add(currentAssignment);
}