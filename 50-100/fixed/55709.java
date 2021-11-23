public int getWeaponRandomDamage() {
    if ((Creature.HeroDataStorage.getInstance().getWeapon()) != null) {
        java.util.Random rand = new java.util.Random();
        int minDamage = Creature.HeroDataStorage.getInstance().getWeapon().getWeaponMinDamage();
        int maxDamage = Creature.HeroDataStorage.getInstance().getWeapon().getWeaponMaxDamage();
        int R = (rand.nextInt((maxDamage - minDamage))) + minDamage;
        return R + (heroBaseDamage);
    }
    return heroBaseDamage;
}