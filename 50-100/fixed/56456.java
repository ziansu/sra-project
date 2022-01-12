private void addIntervals(java.util.List<com.example.mapinguari.workoutclass.exerciseObjects.Interval> intervals) {
    com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView currInt;
    int j = 0;
    for (com.example.mapinguari.workoutclass.exerciseObjects.Interval i : intervals) {
        currInt = new com.example.mapinguari.workoutclass.exerciseObjectsViews.IntervalView(context, i);
        if ((j % 2) == 0) {
            currInt.setBackgroundColor(getResources().getColor(R.color.even_list_item));
        }else {
            currInt.setBackgroundColor(getResources().getColor(R.color.odd_list_item));
        }
        intervalsView.addView(currInt);
        j++;
    }
}