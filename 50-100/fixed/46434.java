@java.lang.Override
public void getPlans(java.util.ArrayList<chisw.com.plans.model.Plan> lPlans) {
    if (!(lPlans.isEmpty())) {
        for (chisw.com.plans.model.Plan plan : lPlans) {
            plans.add(plan);
            dbManager.saveNewPlan(plan);
        }
        chisw.com.plans.others.RestartManager restartManager = new chisw.com.plans.others.RestartManager(ctxt);
        restartManager.Reload();
    }
}