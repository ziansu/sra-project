@java.lang.Override
public void getPlans(java.util.ArrayList<chisw.com.dayit.model.Plan> lPlans) {
    for (chisw.com.dayit.model.Plan plan : lPlans) {
        plans.add(plan);
        dbManager.saveNewPlan(plan);
    }
    if (!(lPlans.isEmpty())) {
        chisw.com.dayit.others.RestartManager restartManager = new chisw.com.dayit.others.RestartManager(getApplication().getApplicationContext());
        restartManager.reload();
    }
}