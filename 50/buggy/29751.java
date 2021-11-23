@java.lang.Override
public void onComplete(java.lang.Throwable failure, java.lang.Object response) {
    if (failure != null) {
        org.opendaylight.controller.cluster.datastore.entityownership.DistributedEntityOwnershipService.LOG.error("Failed to create {} shard", org.opendaylight.controller.cluster.datastore.entityownership.DistributedEntityOwnershipService.ENTITY_OWNERSHIP_SHARD_NAME);
    }else {
        org.opendaylight.controller.cluster.datastore.entityownership.DistributedEntityOwnershipService.LOG.info("Successfully created {} shard", org.opendaylight.controller.cluster.datastore.entityownership.DistributedEntityOwnershipService.ENTITY_OWNERSHIP_SHARD_NAME);
    }
}