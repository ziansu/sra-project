public Model.GameObject.Item.Armor addArmor(Model.GameObject.Item.ItemEnum id, java.lang.String name, java.lang.String description, int x, int y, int requiredLevel, Model.StatStruc modify) {
    this.id = id;
    location = new Model.Location(x, y);
    requirement = new Model.Requirement(requiredLevel);
    effect = new Model.Effects.Effect(modify);
    return new Model.GameObject.Item.Armor(id, name, description, location, requirement, effect);
}