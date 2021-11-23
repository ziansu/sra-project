@butterknife.OnClick(value = { R.id.inputAppraisalExpandBox })
public void toggleAppraisalBox() {
    toggleVisibility(inputAppraisalExpandBox, appraisalBox, true);
    positionHandler.setVisibility(appraisalBox.getVisibility());
    moveOverlayUpOrDownToMatchAppraisalBox();
    setWindowPosition();
}