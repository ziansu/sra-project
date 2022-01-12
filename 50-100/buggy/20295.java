protected void setNewTargetPosition(com.dinasgames.main.Math.Vector2f mousePosition) {
    if (isReference()) {
        ref().setNewTargetPosition(mousePosition);
        return ;
    }
    com.dinasgames.main.Objects.Entities.Entity[] selectedEntities = mEntitySelection.getSelections();
    for (com.dinasgames.main.Objects.Entities.Entity selectedEntity : selectedEntities) {
        if (selectedEntity.hasType(GameObjectType.Unit)) {
            com.dinasgames.main.Objects.Entities.Units.Unit unit = ((com.dinasgames.main.Objects.Entities.Units.Unit) (selectedEntity));
            unit.setTargetPosition(mousePosition);
        }
    }
}