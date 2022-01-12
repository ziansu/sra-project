private void onRetainOwnershipCommand(io.tetrapod.core.storage.RetainOwnershipCommand command) {
    final io.tetrapod.core.storage.Message msg = new io.tetrapod.core.storage.RetainOwnershipMessage(command.getOwnerId(), command.getPrefix(), command.getExpiry());
    synchronized(topicsToOwners) {
        final java.util.Set<io.tetrapod.core.storage.Session> owners = topicsToOwners.get(command.getPrefix());
        if (owners != null) {
            for (io.tetrapod.core.storage.Session ses : owners) {
                sendOwnershipMessage(msg, ses);
            }
        }
    }
}