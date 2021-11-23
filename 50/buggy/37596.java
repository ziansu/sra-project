public static entity.item.weapon.Weapon getRandomWeapon(int x, int y, java.util.Random r) {
    return entity.item.weapon.Weapon.getWeapon(entity.item.weapon.WeaponType.getWeaponRandType(r), entity.item.weapon.WeaponMaterial.getWeaponRandMat(r), x, y);
}