public static Model.Item.Weapon createSword(Model.Item.Weapon a) {
    Model.Location l = new Model.Location((-1), (-1), 0);
    a = new Model.Item.Weapon(View.Graphics.Assets.sword, l, ItemsEnum.WEAPON, "Sword", "Sword with 5 attack", null, null, 5, null);
    return a;
}