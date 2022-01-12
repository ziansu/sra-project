private void update() {
    clear();
    allContentTagView.getItems().addAll(pastaViewController.getPastaManager().getTagList());
    allAssignTagView.getItems().addAll(pastaViewController.getPastaManager().getAssignmentTagList());
    if (!(allAssignTagView.getItems().contains(currentAssignment)))
        allAssignTagView.getItems().add(currentAssignment);
    
}