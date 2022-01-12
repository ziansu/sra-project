public static void init() {
    makeo.gadomancy.common.registration.RegisteredPotions.POTION_LUCK = makeo.gadomancy.common.registration.RegisteredPotions.registerPotion(makeo.gadomancy.common.registration.PotionMiningLuck.class);
    makeo.gadomancy.common.registration.RegisteredPotions.BUFF_GOLEM = makeo.gadomancy.common.registration.RegisteredPotions.registerPotion(makeo.gadomancy.common.registration.PotionBuffGolem.class);
    makeo.gadomancy.common.registration.RegisteredPotions.ACHROMATIC = makeo.gadomancy.common.registration.RegisteredPotions.registerPotion(makeo.gadomancy.common.registration.PotionAchromatic.class);
    makeo.gadomancy.common.registration.RegisteredPotions.ELDRITCH = makeo.gadomancy.common.registration.RegisteredPotions.registerPotion(makeo.gadomancy.common.potions.PotionEldritch.class);
    makeo.gadomancy.common.registration.RegisteredPotions.VIS_DISCOUNT = makeo.gadomancy.common.registration.RegisteredPotions.registerPotion(makeo.gadomancy.common.registration.PotionVisAffinity.class);
    makeo.gadomancy.common.data.config.ModConfig.save();
}