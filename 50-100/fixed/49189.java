@org.junit.Test
public void remove_invokesRemovalFromDatabaseLookup() {
    com.limpygnome.parrot.library.db.DatabaseNode node = new com.limpygnome.parrot.library.db.DatabaseNode(database, null);
    com.limpygnome.parrot.library.db.DatabaseNode child = node.addNew();
    java.util.UUID uuid = child.getUuid();
    child.remove();
    org.mockito.Mockito.verify(databaseLookup).remove(child);
}