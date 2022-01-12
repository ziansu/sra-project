private static net.minecraft.item.Item getItem(java.lang.String item) {
    java.lang.String one = (item.contains(";")) ? terrails.terracore.helper.StringHelper.getSubstringBefore(item, ";") : item.contains(",") ? terrails.terracore.helper.StringHelper.getSubstringBefore(item, ",") : item;
    return net.minecraft.item.Item.getByNameOrId(one);
}