@java.lang.Override
public final void setGoal(us.ihmc.footstepPlanning.FootstepPlannerGoal goal) {
    planarRegionPotentialNextStepCalculator.setGoal(goal);
    goalWasSet = true;
}