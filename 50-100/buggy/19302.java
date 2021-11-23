public static void initNodesIndex(java.lang.String indexConfig) {
    switch (indexConfig) {
        case "redis" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.RedisNodesIndex();
        case "ignite" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.IgniteNodesIndex();
        case "internal" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.NodesIndex();
        default :
            org.dragons.neo4j.index.NodesIndexMngr.index = null;
    }
}