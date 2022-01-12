public static void addConversion(net.minecraft.item.ItemStack stack, com.iconmaster.aec2.aether.ItemConversionRegistry.RatioList cpds) {
    java.util.Arrays.sort(cpds.ratios);
    java.util.ArrayList<com.iconmaster.aec2.aether.ItemConversionRegistry.RatioList> ita = com.iconmaster.aec2.aether.ItemConversionRegistry.itemToAether.get(com.iconmaster.aec2.aether.ItemConversionRegistry.stackHash(stack));
    if (ita == null) {
        ita = new java.util.ArrayList<com.iconmaster.aec2.aether.ItemConversionRegistry.RatioList>();
        com.iconmaster.aec2.aether.ItemConversionRegistry.itemToAether.put(com.iconmaster.aec2.aether.ItemConversionRegistry.stackHash(stack), ita);
    }
    ita.add(cpds);
    com.iconmaster.aec2.aether.ItemConversionRegistry.addMat(stack, cpds.ratios);
}