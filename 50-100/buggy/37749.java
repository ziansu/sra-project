@java.lang.Override
public java.util.List<uk.gov.nationalarchives.discovery.taxonomy.domain.repository.AtomicUpdate> getLastUpdates(java.lang.Integer nbOfItems) {
    java.util.List<uk.gov.nationalarchives.discovery.taxonomy.domain.repository.AtomicUpdate> updates = new java.util.ArrayList<>();
    int nbOfItemsPolled = 0;
    while ((!(uk.gov.nationalarchives.discovery.taxonomy.repository.impl.MemoryUpdateRepositoryImpl.updateQueue.isEmpty())) && (nbOfItemsPolled < nbOfItems)) {
        updates.add(uk.gov.nationalarchives.discovery.taxonomy.repository.impl.MemoryUpdateRepositoryImpl.updateQueue.poll());
    } 
    return updates;
}