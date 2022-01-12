public static java.lang.String getFormatName(final java.lang.String id) {
    if (!(com.github.lunatrius.schematica.world.schematic.SchematicFormat.FORMATS.containsKey(id))) {
        Reference.logger.warn("No format for schematic with id {}; returning null", new com.github.lunatrius.schematica.world.schematic.UnsupportedFormatException(id).fillInStackTrace(), id);
        return null;
    }
    return com.github.lunatrius.schematica.world.schematic.SchematicFormat.FORMATS.get(id).getName();
}