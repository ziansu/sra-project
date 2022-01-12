@java.lang.Override
public void setRangeLowerBound(RangeType lowerBound) {
    super.setRangeLowerBound(lowerBound);
    scalesDirty = true;
}