@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.eclipse.equinox.http.servlet.internal.registration.ListenerRegistration)) {
        return false;
    }
    org.eclipse.equinox.http.servlet.internal.registration.ListenerRegistration listenerRegistration = ((org.eclipse.equinox.http.servlet.internal.registration.ListenerRegistration) (obj));
    return super.getT().equals(listenerRegistration.getT());
}