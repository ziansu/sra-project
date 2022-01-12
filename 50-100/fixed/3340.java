@com.codingchili.realm.model.Test
public void testReadPlayerClasses() throws java.io.IOException {
    java.util.List<io.vertx.core.json.JsonObject> classes = com.codingchili.core.files.JsonFileStore.readDirectoryObjects(testDirectory("class"));
    for (io.vertx.core.json.JsonObject player : classes) {
        com.codingchili.core.protocol.Serializer.unpack(player, com.codingchili.realm.model.PlayerClass.class);
    }
    com.codingchili.realm.model.Assert.assertFalse(classes.isEmpty());
}