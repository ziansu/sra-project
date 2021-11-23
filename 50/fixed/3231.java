public static boolean registerTextures(gregtech.api.objects.GT_CopiedBlockTexture gt_CopiedBlockTexture) {
    Textures.BlockIcons.CASING_BLOCKS[gregtech.api.enums.TAE.gtPPLastUsedIndex] = gt_CopiedBlockTexture;
    (gregtech.api.enums.TAE.gtPPLastUsedIndex)++;
    return true;
}