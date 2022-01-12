private float calcX(int i) {
    return (((((getWidth()) - (getPaddingRight())) - (getPaddingLeft())) / ((mDataSet.size()) - 1.0F)) * i) + (getPaddingLeft());
}