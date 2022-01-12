@org.junit.Test
public void testCopyFromInvalidJson() throws java.lang.Exception {
    execute("create table foo (id integer primary key) clustered into 1 shards with (number_of_replicas=0)");
    ensureYellow();
    java.io.File newFile = folder.newFile();
    try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(newFile))) {
        writer.write("{|}");
    }
    expectedException.expect(io.crate.action.sql.SQLActionException.class);
    expectedException.expectMessage("Failed to parse content to map");
    execute("copy foo from ?", new java.lang.Object[]{ newFile.getPath() });
}