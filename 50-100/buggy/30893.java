public Model.GameObject.Item.Interactable addInteractable(java.lang.String name, java.lang.String description, int x, int y, int level, Model.GameObject.Item.Items.Takables.Quest requiredItem) {
    id = ItemEnum.INTERACTABLE;
    location = new Model.Location(x, y, 0);
    requirement = new Model.Requirement(level, requiredItem);
    return new Model.GameObject.Item.Interactable(id, name, description, location, requirement);
}