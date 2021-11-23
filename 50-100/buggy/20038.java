@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/service/{serviceName}/plan", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<io.pivotal.cfservicebroker.model.Plan> listPlansForService(@org.springframework.web.bind.annotation.PathVariable(value = "serviceName")
java.lang.String serviceName) {
    java.lang.System.out.println("XXXXXXXXXXXXXXXXXXXXXX listPlansForService XXXXXXXXXXXXXXXXXXXXXX");
    java.util.List<io.pivotal.cfservicebroker.model.Plan> plans = planRepository.findByServiceName(serviceName, new org.springframework.data.domain.Sort("name"));
    for (io.pivotal.cfservicebroker.model.Plan plan : plans) {
        java.util.List<io.pivotal.cfservicebroker.model.Credential> credentialList = credentialRepository.findByPlanNameAndServiceName(plan.getName(), serviceName, new org.springframework.data.domain.Sort("key"));
        plan.setCredentialList(credentialList);
        plan.setCredentials(credentialList);
    }
    return plans;
}