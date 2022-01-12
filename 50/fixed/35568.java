public static fr.zomdev.naturalstuff.enumerations.GemBlocksEnumType getStateFromMeta(int metadata) {
    if ((metadata < 0) || (metadata > (fr.zomdev.naturalstuff.enumerations.GemBlocksEnumType.metas.length))) {
        metadata = 0;
    }
    return fr.zomdev.naturalstuff.enumerations.GemBlocksEnumType.metas[metadata];
}