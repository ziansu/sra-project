public void setHolderWidth(int mHolderWidth) {
    if ((mHolderWidth < 20) || (mHolderWidth > 120)) {
        return ;
    }
    this.mHolderWidth = mHolderWidth + (com.bvapp.arcraymenu.RayLayout.DEFAULT_CHILD_GAP);
    requestLayout();
}