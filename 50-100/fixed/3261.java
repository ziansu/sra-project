public Model.GameObject.Item.Items.Takables.Quest addQuest(java.lang.String name, java.lang.String description, int x, int y, int requiredLevel, Model.StatStruc modify) {
    id = ItemEnum.QUEST;
    location = new Model.Location(x, y);
    requirement = new Model.Requirement(requiredLevel);
    effect = new Model.Effects.Effect(modify);
    return new Model.GameObject.Item.Items.Takables.Quest(id, name, description, location, requirement, effect);
}