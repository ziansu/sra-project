public void hideFragmentContainer(boolean isHide) {
    if (isHide)
        fragmentContainer.setVisibility(View.GONE);
    else
        fragmentContainer.setVisibility(View.VISIBLE);
    
}