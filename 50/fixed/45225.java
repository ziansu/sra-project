public static boolean doesOreExistAndValid(java.lang.String name) {
    return !(net.minecraftforge.oredict.OreDictionary.getOres(name).isEmpty());
}