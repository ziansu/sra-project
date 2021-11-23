@java.lang.Override
public void unregistered(org.eclipse.leshan.server.registration.Registration registration, java.util.Collection<org.eclipse.leshan.core.observation.Observation> observations, boolean expired, org.eclipse.leshan.server.registration.Registration newReg) {
    if (registration.getEndpoint().equals(currentEndpointIdentifier.get())) {
        deregisterLatch.countDown();
    }
}