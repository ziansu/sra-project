private void setSelectedButtonHighlight(boolean highlighted) {
    mCallback.setEqualButtonColor(highlighted);
    if ((mUnitType.getCurrUnitButtonPos()) < (mNumConvButtons)) {
        int currButtonPos = mUnitType.getCurrUnitButtonPos();
        if (currButtonPos == (-1))
            return ;
        
        if (currButtonPos >= (mConvButton.size()))
            return ;
        
        mConvButton.get(currButtonPos).setSelected(highlighted);
    }
}