@java.lang.Override
public void setActivitiesAverage(int completedActivitiesAverage, int incompleteActivitiesAverage, int notDoneActivitiesAverage) {
    if ((tvCompleted) != null)
        tvCompleted.setText(java.lang.String.format("%s%%", completedActivitiesAverage));
    
    if ((tvIncomplete) != null)
        tvIncomplete.setText(java.lang.String.format("%s%%", incompleteActivitiesAverage));
    
    if ((tvNotDone) != null)
        tvNotDone.setText(java.lang.String.format("%s%%", notDoneActivitiesAverage));
    
    setProgressInfo(completedActivitiesAverage, incompleteActivitiesAverage, notDoneActivitiesAverage);
}