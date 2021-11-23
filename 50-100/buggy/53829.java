private static void addConfigAlkahestCraftingRecipe(net.minecraftforge.common.config.ConfigCategory category, java.lang.String item, java.lang.Integer meta, java.lang.Integer yield, java.lang.Integer cost) {
    net.minecraftforge.common.config.Property prop = new net.minecraftforge.common.config.Property(((item + "|") + meta), new java.lang.String[]{ yield.toString() , cost.toString() }, Property.Type.INTEGER);
    category.put(item, prop);
}