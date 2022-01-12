com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView addInterval(com.example.mapinguari.workoutclass.exerciseObjects.Interval interval) {
    com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView intervalView = new com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView(context, interval);
    int pos = (intervalsView.getChildCount()) - 2;
    if ((pos % 2) == 0) {
        intervalView.setBackgroundColor(getResources().getColor(R.color.even_list_item));
    }else {
        intervalView.setBackgroundColor(getResources().getColor(R.color.odd_list_item));
    }
    intervalsView.addView(intervalView, pos);
    return intervalView;
}