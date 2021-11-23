@java.lang.Override
public int compare(us.ihmc.footstepPlanning.graphSearch.BipedalFootstepPlannerNode o1, us.ihmc.footstepPlanning.graphSearch.BipedalFootstepPlannerNode o2) {
    double cost1 = o1.getCostToHereFromStart();
    double cost2 = o2.getCostToHereFromStart();
    return cost1 < cost2 ? -1 : 1;
}