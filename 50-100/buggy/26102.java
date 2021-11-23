private void reapplyLocalChanges(org.eclipse.emf.emfstore.internal.server.model.versioning.AbstractChangePackage myChangePackage) {
    if (org.eclipse.emf.emfstore.internal.client.model.Configuration.getClientBehavior().isRerecordingActivated()) {
        final org.eclipse.emf.emfstore.server.ESCloseableIterable<org.eclipse.emf.emfstore.internal.server.model.versioning.operations.AbstractOperation> operations = myChangePackage.operations();
        try {
            applyOperationsWithRerecording(operations.iterable());
        } finally {
            operations.close();
        }
    }else {
        final org.eclipse.emf.emfstore.server.ESCloseableIterable<org.eclipse.emf.emfstore.internal.server.model.versioning.operations.AbstractOperation> operations = myChangePackage.operations();
        try {
            applyOperations(operations.iterable(), true);
        } finally {
            operations.close();
        }
    }
}