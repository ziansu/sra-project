public static void initNodesIndex(java.lang.String indexConfig) {
    switch (indexConfig) {
        case "redis" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.RedisNodesIndex();
            break;
        case "ignite" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.IgniteNodesIndex();
            break;
        case "internal" :
            org.dragons.neo4j.index.NodesIndexMngr.index = new org.dragons.neo4j.index.NodesIndex();
            break;
        default :
            org.dragons.neo4j.index.NodesIndexMngr.index = null;
            break;
    }
}