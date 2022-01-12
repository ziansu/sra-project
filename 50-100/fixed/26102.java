private void reapplyLocalChanges(org.eclipse.emf.emfstore.internal.server.model.versioning.AbstractChangePackage myChangePackage) {
    final org.eclipse.emf.emfstore.server.ESCloseableIterable<org.eclipse.emf.emfstore.internal.server.model.versioning.operations.AbstractOperation> operations = myChangePackage.operations();
    try {
        if (org.eclipse.emf.emfstore.internal.client.model.Configuration.getClientBehavior().isRerecordingActivated()) {
            applyOperationsWithRerecording(operations.iterable());
        }else {
            applyOperations(operations.iterable(), true);
        }
    } finally {
        operations.close();
    }
}