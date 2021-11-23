@java.lang.SuppressWarnings(value = "rawtypes")
public java.util.List<org.eclipse.emf.emfstore.internal.server.model.accesscontrol.ACOrgUnit> getOrgUnits(org.eclipse.emf.emfstore.internal.server.model.SessionId sessionId) throws org.eclipse.emf.emfstore.server.exceptions.ESException {
    getConnectionProxy(sessionId);
    return adminEmfStore.getOrgUnits(sessionId);
}