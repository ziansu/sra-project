public static void main(java.lang.String[] args) throws java.lang.Exception {
    payne.framework.pigeon.server.InvocationContext context = new payne.framework.pigeon.server.bio.BlockingInvocationContext();
    context.bind(9090);
    context.register(new payne.framework.pigeon.sample.validation.ValidatedAPIImpl());
    context.register(new payne.framework.pigeon.generation.objc.ObjectiveCGeneratorService(false));
    context.startup();
}