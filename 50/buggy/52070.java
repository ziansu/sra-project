@java.lang.Override
public void registered(org.eclipse.leshan.server.registration.Registration registration, org.eclipse.leshan.server.registration.Registration previousReg, java.util.Collection<org.eclipse.leshan.core.observation.Observation> previousObsersations) {
    if (registration.getEndpoint().equals(currentEndpointIdentifier)) {
        last_registration = registration;
        registerLatch.countDown();
    }
}