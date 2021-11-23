public org.opentosca.planbuilder.model.plan.BuildPlan buildPlan(org.opentosca.planbuilder.model.tosca.AbstractDefinitions defs, java.lang.String csarName, javax.xml.namespace.QName serviceTemplate) {
    org.opentosca.planbuilder.PlanBuilder planBuilder = new org.opentosca.planbuilder.PlanBuilder();
    return planBuilder.buildPlan(csarName, defs, serviceTemplate);
}