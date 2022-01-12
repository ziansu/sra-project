@java.lang.Override
public void setActivitiesAverage(int completedActivitiesAverage, int incompleteActivitiesAverage, int notDoneActivitiesAverage) {
    tvCompleted.setText(java.lang.String.format("%s%%", completedActivitiesAverage));
    tvIncomplete.setText(java.lang.String.format("%s%%", incompleteActivitiesAverage));
    tvNotDone.setText(java.lang.String.format("%s%%", notDoneActivitiesAverage));
    setProgressInfo(completedActivitiesAverage, incompleteActivitiesAverage, notDoneActivitiesAverage);
}