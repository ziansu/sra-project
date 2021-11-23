@java.lang.Override
protected void configure() {
    bindFactory(org.openur.remoting.resource.userstructure.MockUserServicesFactory.class).to(org.openur.module.service.userstructure.IUserServices.class);
    bindFactory(org.openur.remoting.resource.errorhandling.MockErrorHandlingFactory.class).to(org.openur.module.integration.security.shiro.OpenUrRdbmsRealm.class);
}