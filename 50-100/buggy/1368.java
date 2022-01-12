@java.lang.Override
public void addTooltip(java.util.List list) {
    list.add(((net.minecraft.util.EnumChatFormatting.DARK_GREEN) + (format(spawnNumberMin, spawnNumberMax))));
    list.addAll(java.util.Arrays.asList(org.apache.commons.lang3.text.WordUtils.wrap(((java.lang.String) (field.getField())), 28).split("\r\n")));
    net.minecraft.item.ItemStack stack = getIcon();
    if (stack != null) {
        list.add("---");
        list.add(entity.getName());
    }
}