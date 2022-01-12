public void addLink(iMat.controller.BackButtonHandler.Link link) {
    backButton.setDisable(false);
    if (((currentIndex) + 1) != (history.size())) {
        cutOffBranch();
    }
    if (link == (iMat.controller.BackButtonHandler.Link.PRODUCT)) {
    }
    history.add(new iMat.controller.BackButtonHandler.SavedPage(link));
    (currentIndex)++;
}