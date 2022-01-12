protected boolean checkIndicatorDrawable(int index) {
    if (((seekBarElementList) == null) || ((seekBarElementList.size()) < 1))
        return false;
    
    hu.mesys.snappingseekbar.library.models.SeekbarElement element = seekBarElementList.get(index);
    indicatorDrawableId = element.getIndicatorDrawableId();
    indicatorColor = element.getIndicatorColor();
    setIndicatorPadding(element.getIndicatorPadding());
    return true;
}