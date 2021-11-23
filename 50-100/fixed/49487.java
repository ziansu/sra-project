public Model.GameObject.Item.Weapon addWeapon(Model.GameObject.Item.ItemEnum id, java.lang.String name, java.lang.String description, int x, int y, Model.GameObject.Item.Items.Takables.Quest requiredItem, Model.StatStruc modify) {
    this.id = id;
    location = new Model.Location(x, y);
    requirement = new Model.Requirement(requiredItem);
    effect = new Model.Effects.Effect(modify);
    return new Model.GameObject.Item.Weapon(id, name, description, location, requirement, effect);
}