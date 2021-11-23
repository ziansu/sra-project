public static Model.Item.Useable createManaPotion(Model.Item.Useable a) {
    Model.Location l = new Model.Location((-1), (-1), 0);
    a = new Model.Item.Useable(View.Graphics.Assets.manapotion, l, ItemsEnum.USEABLE, "Potion", "This heals 3 health", null, null);
    return a;
}