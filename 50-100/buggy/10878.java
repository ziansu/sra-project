public void updateUI() {
    int prevBtnVisibility = android.view.View.VISIBLE;
    int nextBtnVisibility = android.view.View.VISIBLE;
    if ((itemIndex) == 0) {
        prevBtnVisibility = android.view.View.INVISIBLE;
    }else
        if ((itemIndex) == ((shareClipExperience.getChildrenContents().size()) - 1)) {
            nextBtnVisibility = android.view.View.INVISIBLE;
        }
    
    prevClipButton.setVisibility(prevBtnVisibility);
    nextClipButton.setVisibility(nextBtnVisibility);
    mediaController.hide();
}