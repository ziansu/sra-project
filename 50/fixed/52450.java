public static boolean existsLocally(java.lang.String planId) {
    if (planId == null)
        return false;
    
    java.util.TreeMap<java.lang.String, pt.lsts.neptus.types.mission.plan.PlanType> plansList = Preflight.CONSOLE.getMission().getIndividualPlansList();
    return plansList.containsKey(planId);
}