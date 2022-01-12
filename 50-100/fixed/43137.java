@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/service/{serviceName}/plan/{planName}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public io.pivotal.cfservicebroker.model.Plan getPlan(@org.springframework.web.bind.annotation.PathVariable(value = "serviceName")
java.lang.String serviceName, @org.springframework.web.bind.annotation.PathVariable(value = "planName")
java.lang.String planName) {
    java.lang.System.out.println("XXXXXXXXXXXXXXXXXXXXXX getPlan XXXXXXXXXXXXXXXXXXXXXX");
    io.pivotal.cfservicebroker.model.Plan result = planRepository.findOneByNameAndServiceName(planName, serviceName);
    if (result != null) {
        result.setCredentials(credentialRepository.findByPlanNameAndServiceName(result.getName(), serviceName, new org.springframework.data.domain.Sort("key")));
    }
    return result;
}