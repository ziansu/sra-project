public static void main(java.lang.String[] args) throws java.lang.Exception {
    payne.framework.pigeon.server.InvocationContext context = new payne.framework.pigeon.server.bio.BlockingInvocationContext();
    context.bind(9090);
    context.setBeanConfigurationPaths(new java.lang.String[]{ "pigeon.properties" , "pigeon-encryption.properties" });
    context.register(new payne.framework.pigeon.sample.validation.ValidatedAPIImpl());
    context.register(new payne.framework.pigeon.generation.objc.ObjectiveCGeneratorService(false));
    context.startup();
}