private void generateInventories(java.lang.String path, com.pottda.game.MyXMLReader reader) {
    com.badlogic.gdx.files.FileHandle folder = Gdx.files.internal("inventoryblueprint");
    java.util.List<com.badlogic.gdx.files.FileHandle> contents = java.util.Arrays.asList(folder.list("xml"));
    try {
        for (com.badlogic.gdx.files.FileHandle f : contents) {
            com.pottda.game.InventoryBlueprint.newBlueprint(reader.parseInventory(f));
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.Error("failed to generate inventory blueprints: ", e);
    }
}