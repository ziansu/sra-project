public org.opendaylight.yangtools.concepts.CompositeObjectRegistration.CompositeObjectRegistrationBuilder<T> add(final org.opendaylight.yangtools.concepts.ObjectRegistration<? super T> registration) {
    if (!(registration.getInstance().equals(instance))) {
        throw new java.lang.IllegalArgumentException("Instance must be same.");
    }
    registrations.add(registration);
    return this;
}