@java.lang.Override
public void onFinishEditGoalUpdateDialog(int inputGoalUpdate) {
    goal = inputGoalUpdate;
    kled.pagesaver.ViewGoalActivity.UpdateParams update_goal = new kled.pagesaver.ViewGoalActivity.UpdateParams(entryId, 0, goal);
    kled.pagesaver.ViewGoalActivity.EntryUpdateWorker updateWorkerGoal = new kled.pagesaver.ViewGoalActivity.EntryUpdateWorker();
    updateWorkerGoal.execute(update_goal);
    finish();
}