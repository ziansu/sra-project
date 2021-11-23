@java.lang.Override
public void propagateSchemaChanges(final com.orientechnologies.orient.core.db.ODatabaseInternal iDatabase) {
    final com.orientechnologies.orient.server.hazelcast.ODistributedConfiguration cfg = getDatabaseConfiguration(iDatabase.getName());
    if (cfg == null)
        return ;
    
    for (com.orientechnologies.orient.core.metadata.schema.OClass c : iDatabase.getMetadata().getSchema().getClasses()) {
        if (!((c.getClusterSelection()) instanceof com.orientechnologies.orient.server.hazelcast.OLocalClusterStrategy))
            installClustersOfClass(iDatabase, c);
        
    }
}