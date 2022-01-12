public static boolean hasTerminationPlan(org.opentosca.container.core.model.csar.id.CSARID csarId) throws org.opentosca.container.core.common.SystemException, org.opentosca.container.core.common.UserException {
    java.util.Map<org.opentosca.container.core.tosca.extension.PlanTypes, java.util.LinkedHashMap<javax.xml.namespace.QName, org.opentosca.container.core.tosca.model.TPlan>> plans = org.opentosca.container.api.legacy.osgi.servicegetter.ToscaServiceHandler.getToscaEngineService().getToscaReferenceMapper().getCSARIDToPlans(csarId);
    if (plans == null)
        return false;
    
    return (plans.containsKey(PlanTypes.TERMINATION)) & (!(plans.get(PlanTypes.TERMINATION).isEmpty())) ? true : false;
}