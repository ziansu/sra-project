void addInterval(com.example.mapinguari.workoutclass.exerciseObjects.Interval interval) {
    com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView intervalView = intervalViewToAdd(interval);
    int pos = intervalsView.getChildCount();
    if ((pos % 2) == 0) {
        intervalView.setBackgroundColor(getResources().getColor(R.color.even_list_item));
    }else {
        intervalView.setBackgroundColor(getResources().getColor(R.color.odd_list_item));
    }
    intervalsView.addView(intervalView, pos);
}