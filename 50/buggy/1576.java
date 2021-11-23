public void notifyDataSetChanged() {
    calcMinMax(mLastStart, mLastEnd);
    calcYValueSum();
}