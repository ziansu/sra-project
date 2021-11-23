public static boolean hasBuildPlan(org.opentosca.container.core.model.csar.id.CSARID csarId) throws org.opentosca.container.core.common.SystemException, org.opentosca.container.core.common.UserException {
    javax.xml.namespace.QName serviceTemplateId = org.opentosca.container.api.legacy.resources.utilities.ModelUtils.getEntryServiceTemplate(csarId);
    java.util.Map<org.opentosca.container.core.tosca.extension.PlanTypes, java.util.LinkedHashMap<javax.xml.namespace.QName, org.opentosca.container.core.tosca.model.TPlan>> plans = org.opentosca.container.api.legacy.osgi.servicegetter.ToscaServiceHandler.getToscaEngineService().getToscaReferenceMapper().getCSARIDToPlans(csarId);
    if (plans == null)
        return false;
    
    return plans.containsKey(PlanTypes.BUILD);
}