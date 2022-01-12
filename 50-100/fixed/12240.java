public com.sk89q.worldedit.CuboidClipboard getSchematic(java.lang.String schematicName) {
    java.io.File dir = new java.io.File(schematicName);
    com.sk89q.worldedit.schematic.SchematicFormat schematic = com.sk89q.worldedit.schematic.SchematicFormat.getFormat(dir);
    try {
        clipboard = schematic.load(dir);
    } catch (com.sk89q.worldedit.data.DataException | java.io.IOException e) {
        e.printStackTrace();
    }
    dir = null;
    schematic = null;
    return clipboard;
}