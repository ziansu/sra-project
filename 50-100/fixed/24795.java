public static java.lang.String getFormatName(final java.lang.String id) {
    if (!(com.github.lunatrius.schematica.world.schematic.SchematicFormat.FORMATS.containsKey(id))) {
        Reference.logger.warn("No format for schematic with id {}; returning null", id, new com.github.lunatrius.schematica.world.schematic.UnsupportedFormatException(id).fillInStackTrace());
        return null;
    }
    return com.github.lunatrius.schematica.world.schematic.SchematicFormat.FORMATS.get(id).getName();
}