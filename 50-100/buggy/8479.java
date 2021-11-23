public static boolean oresExist(java.lang.String... names) {
    for (java.lang.String name : names) {
        if (!(net.minecraftforge.oredict.OreDictionary.doesOreNameExist(name))) {
            return false;
        }
        if (!(net.minecraftforge.oredict.OreDictionary.getOres(name).isEmpty())) {
            return false;
        }
    }
    return true;
}