public void onChanged(kankan.wheel.widget.WheelView wheel, int oldValue, int newValue) {
    curMinItemIndex = min.getCurrentItem();
    curMin = java.lang.Integer.parseInt(ms[curMinItemIndex]);
    min.setViewAdapter(new tw.edu.ntu.csie.angryrunner.TimeActivity.DateArrayAdapter(this, ms, curMinItemIndex));
    min.setCurrentItem(curMinItemIndex);
    Time = calculateTime();
}