public boolean isOutOfRange(com.wdullaer.materialdatetimepicker.time.Timepoint current) {
    if (((mMinTime) != null) && ((mMinTime.compareTo(current)) > 0))
        return true;
    
    if (((mMaxTime) != null) && ((mMaxTime.compareTo(current)) < 0))
        return true;
    
    if ((mSelectableTimes) != null)
        return !(java.util.Arrays.asList(mSelectableTimes).contains(current));
    
    return false;
}