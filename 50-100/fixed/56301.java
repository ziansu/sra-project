private static void addConfigAlkahestChargingRecipe(net.minecraftforge.common.config.ConfigCategory category, java.lang.String item, @java.lang.SuppressWarnings(value = "SameParameterValue")
java.lang.Integer meta, java.lang.Integer charge) {
    net.minecraftforge.common.config.Property prop = new net.minecraftforge.common.config.Property(item, new java.lang.String[]{ charge.toString() }, Property.Type.INTEGER);
    category.put(item, prop);
}