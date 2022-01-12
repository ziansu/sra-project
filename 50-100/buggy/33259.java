@org.junit.Test
public void canRemoveFilesAndReinvokeShutdown() throws java.io.IOException {
    org.neo4j.kernel.internal.GraphDatabaseAPI databaseAPI = ((org.neo4j.kernel.internal.GraphDatabaseAPI) (this.graphDb));
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction = getDatabaseFileSystem(databaseAPI);
    graphDb.shutdown();
    fileSystemAbstraction.deleteRecursively(new java.io.File(databaseAPI.getStoreDir()));
    graphDb.shutdown();
}