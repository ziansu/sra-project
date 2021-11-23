protected java.util.List<org.opentosca.planbuilder.model.plan.BuildPlan> buildPlans(org.opentosca.planbuilder.model.tosca.AbstractDefinitions defs, java.lang.String csarName) {
    org.opentosca.planbuilder.PlanBuilder planBuilder = new org.opentosca.planbuilder.PlanBuilder();
    return planBuilder.buildPlans(csarName, defs);
}