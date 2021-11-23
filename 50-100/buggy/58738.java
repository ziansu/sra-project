@java.lang.Override
public net.minecraft.util.IIcon getIcon(net.minecraft.item.ItemStack stack, int pass) {
    if (((amerifrance.guideapi.api.GuideRegistry.getSize()) > (stack.getItemDamage())) && ((amerifrance.guideapi.api.GuideRegistry.getBook(stack.getItemDamage()).itemTexture) != null)) {
        return customIcons[stack.getItemDamage()];
    }else {
        if (pass == 0)
            return itemIcon;
        else
            return pagesIcon;
        
    }
}