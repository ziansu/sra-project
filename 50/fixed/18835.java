public void setIsSelect(boolean selected) {
    if (selected)
        scaleAnimDrawable.expand(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    else
        scaleAnimDrawable.shrink(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    
}