public org.gradle.internal.remote.ConnectionAcceptor accept(org.gradle.api.Action<org.gradle.internal.remote.ObjectConnection> action) {
    return connector.accept(new org.gradle.internal.remote.internal.hub.MessageHubBackedServer.ConnectEventAction(action), true);
}