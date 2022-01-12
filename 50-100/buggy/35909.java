@java.lang.Override
public void onMilestoneReceived(@android.support.annotation.Nullable
com.ericmguimaraes.gaso.evaluation.Milestone milestone) {
    if (milestone == null)
        milestone = dao.createNewMilestone(0, 0, null);
    
    if ((milestone.getFuzzyConsumption()) == null)
        milestone.setFuzzyConsumption(new com.ericmguimaraes.gaso.model.FuzzyConsumption());
    
    milestone.getFuzzyConsumption().incrementComsuption(consumptionName);
    dao.addOrUpdate(milestone);
}