public void next() {
    (indexPointer)++;
    if ((indexPointer) > ((mSize) - 1)) {
        android.util.Log.d("ProgressDotBar", "Index overflow");
        return ;
    }
    updateDots();
}