@java.lang.Override
public void updated(org.eclipse.leshan.server.registration.RegistrationUpdate update, org.eclipse.leshan.server.registration.Registration updatedRegistration, org.eclipse.leshan.server.registration.Registration previousRegistration) {
    if (updatedRegistration.getEndpoint().equals(currentEndpointIdentifier.get())) {
        updateLatch.countDown();
    }
}