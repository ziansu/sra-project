@java.lang.Override
public void onYearSelected(int year) {
    super.onYearSelected(year);
    if ((((mContext) != null) && ((mCar) != null)) && (isAdded())) {
        summarize();
    }
}