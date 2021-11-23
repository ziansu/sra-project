public com.change_vision.jude.api.inf.model.IEREntity convert(com.change_vision.astah.extension.plugin.dbreverse.reverser.model.TableInfo tableInfo) {
    com.change_vision.jude.api.inf.model.IEREntity entity = null;
    try {
        java.lang.String name = tableInfo.getName();
        entity = editor.createEREntity(schema, name, name);
        entity.setType(tableInfo.getType());
        if ((tableInfo.getDefinition()) != null) {
            entity.setDefinition(tableInfo.getDefinition());
        }
    } catch (com.change_vision.jude.api.inf.exception.InvalidEditingException e) {
        com.change_vision.astah.extension.plugin.dbreverse.reverser.converter.TableConverter.logger.error("invalid editing exception is occured.", e);
    }
    return entity;
}