public Model.GameObject.Item.Interactable addInteractable(java.lang.String name, java.lang.String description, int x, int y, int requiredLevel) {
    id = ItemEnum.INTERACTABLE;
    location = new Model.Location(x, y);
    requirement = new Model.Requirement(requiredLevel);
    return new Model.GameObject.Item.Interactable(id, name, description, location, requirement);
}