@org.springframework.web.bind.annotation.RequestMapping(value = "/sample", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.catify.initializr.domain.Domain createSample() {
    com.catify.initializr.rest.DomainGeneratorController.LOG.log(java.util.logging.Level.INFO, "request to create sample");
    com.catify.initializr.domain.Domain domain = new com.catify.initializr.domain.Domain("My-Domain", "com.my.domain");
    domain.addService(new com.catify.initializr.domain.MicroService("service-a"));
    domain.addService(new com.catify.initializr.domain.MicroService("service-b"));
    return domain;
}