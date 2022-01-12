private void HideSpinner() {
    if ((mSpinner) == null)
        return ;
    
    mSpinner.clearAnimation();
    mSpinner.setVisibility(View.GONE);
}