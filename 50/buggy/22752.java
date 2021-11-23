public void back() {
    if ((indexPointer) == 0) {
        android.util.Log.d("ProgressDotBar", "Index can't be negative");
        return ;
    }
    (indexPointer)--;
    updateDots();
}