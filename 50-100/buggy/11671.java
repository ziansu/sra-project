public Model.GameObject.Item.Weapon addWeapon(Model.GameObject.Item.ItemEnum id, java.lang.String name, java.lang.String description, int x, int y, int requiredLevel, Model.GameObject.Item.Items.Takables.Quest requiredItem, Model.StatStruc modify) {
    this.id = id;
    location = new Model.Location(x, y, 0);
    requirement = new Model.Requirement(requiredLevel, requiredItem);
    effect = new Model.Effects.Effect(modify);
    return new Model.GameObject.Item.Weapon(id, name, description, location, requirement, effect);
}