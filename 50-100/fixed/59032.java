@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void registerIcons(net.minecraft.client.renderer.texture.IIconRegister ir) {
    itemIcon = ir.registerIcon(((amerifrance.guideapi.ModInformation.TEXLOC) + "book_cover"));
    pagesIcon = ir.registerIcon(((amerifrance.guideapi.ModInformation.TEXLOC) + "book_pages"));
    for (amerifrance.guideapi.api.base.Book book : amerifrance.guideapi.api.GuideRegistry.getBookList())
        if ((book.itemTexture) != null)
            customIcons.add(amerifrance.guideapi.api.GuideRegistry.getIndexOf(book), ir.registerIcon(book.itemTexture));
        
    
}