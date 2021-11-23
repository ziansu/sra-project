public org.eclipse.emf.emfstore.internal.client.model.impl.api.ESServerImpl addServer(org.eclipse.emf.emfstore.client.ESServer server) {
    final org.eclipse.emf.emfstore.internal.client.model.impl.api.ESServerImpl serverImpl = ((org.eclipse.emf.emfstore.internal.client.model.impl.api.ESServerImpl) (server));
    org.eclipse.emf.emfstore.client.util.RunESCommand.run(new java.util.concurrent.Callable<java.lang.Void>() {
        public java.lang.Void call() throws java.lang.Exception {
            toInternalAPI().addServerInfo(serverImpl.toInternalAPI());
            return null;
        }
    });
    toInternalAPI().save();
    return serverImpl;
}