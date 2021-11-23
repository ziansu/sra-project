public org.opendaylight.yangtools.concepts.CompositeObjectRegistration.CompositeObjectRegistrationBuilder<T> remove(final org.opendaylight.yangtools.concepts.ObjectRegistration<? super T> registration) {
    if ((registration.getInstance()) != (instance)) {
        throw new java.lang.IllegalArgumentException("Instance must be same.");
    }
    registrations.remove(registration);
    return this;
}