private void updatePotions() {
    for (net.minecraft.potion.PotionType potiontype : net.minecraft.potion.PotionType.REGISTRY) {
        java.lang.String potion = potiontype.getRegistryName().toString();
        java.lang.String[] modName = potion.split("\\W", 3);
        universalcoins.util.UCItemPricer.ucModnameMap.put(potion, modName[0]);
        if (!(universalcoins.util.UCItemPricer.ucPriceMap.containsKey(potion))) {
            universalcoins.util.UCItemPricer.ucPriceMap.put(potion, (-1));
        }
    }
}