@java.lang.Override
protected int getSuggestedMinimumWidth() {
    if (directionControl) {
        return mChildSize;
    }else {
        return (mHolderWidth) + ((mChildSize) * (getChildCount()));
    }
}