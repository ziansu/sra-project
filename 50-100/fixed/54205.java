private void createSpellCollection() {
    if (myConfig.isSpellCollectionEnabled()) {
        try {
            java.io.File file = new java.io.File(org.caliog.myRPG.Utils.FilePath.spellCollection);
            if (!(file.exists()))
                file.createNewFile();
            
            fc.copyFile(FilePath.spellCollection, "SpellCollection.jar");
        } catch (java.io.IOException e) {
            getLogger().warning("Failed to create SpellCollection.jar!");
        }
    }
}