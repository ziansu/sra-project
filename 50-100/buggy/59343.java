public void addLink(iMat.controller.BackButtonHandler.Link link) {
    backButton.setDisable(false);
    if (((currentIndex) + 1) != (history.size())) {
        cutOffBranch();
    }
    if ((link == (iMat.controller.BackButtonHandler.Link.PRODUCT)) || (link == (iMat.controller.BackButtonHandler.Link.FAVOURITES))) {
    }
    history.add(new iMat.controller.BackButtonHandler.SavedPage(link));
    (currentIndex)++;
}