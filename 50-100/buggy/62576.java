public Model.GameObject.Item.Items.Takables.Quest addQuest(java.lang.String name, java.lang.String description, int x, int y, Model.GameObject.Item.Items.Takables.Quest requiredItem, Model.StatStruc modify) {
    id = ItemEnum.QUEST;
    location = new Model.Location(x, y, 0);
    requirement = new Model.Requirement(requiredItem);
    effect = new Model.Effects.Effect(modify);
    return new Model.GameObject.Item.Items.Takables.Quest(id, name, description, location, requirement, effect);
}