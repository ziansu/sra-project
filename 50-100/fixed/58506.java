public static boolean isSynchronized(java.lang.String planId) {
    if (planId == null)
        return false;
    
    pt.lsts.neptus.comm.manager.imc.ImcSystem sys = pt.lsts.neptus.comm.manager.imc.ImcSystemsHolder.getSystemWithName(Preflight.CONSOLE.getMainSystem());
    pt.lsts.neptus.types.mission.plan.PlanType plan = Preflight.CONSOLE.getMission().getIndividualPlansList().get(planId);
    pt.lsts.neptus.console.plugins.planning.plandb.PlanDBState prs = sys.getPlanDBControl().getRemoteState();
    if ((prs == null) || (!(prs.matchesRemotePlan(plan))))
        return false;
    
    return true;
}