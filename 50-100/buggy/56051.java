public java.util.Comparator<net.minecraft.item.ItemStack> getComparator() {
    final wanion.unidict.Config config = wanion.unidict.UniDict.getConfig();
    return config.enableSpecificEntrySort ? wanion.unidict.common.SpecificEntryItemStackComparator.hasComparatorForEntry(name) ? wanion.unidict.common.SpecificEntryItemStackComparator.getComparatorFor(name) : config.enableSpecificKindSort ? wanion.unidict.common.SpecificKindItemStackComparator.hasComparatorForKind(kind) ? wanion.unidict.common.SpecificKindItemStackComparator.getComparatorFor(kind) : wanion.unidict.common.Util.itemStackComparatorByModName : wanion.unidict.common.Util.itemStackComparatorByModName : config.enableSpecificKindSort ? wanion.unidict.common.SpecificKindItemStackComparator.hasComparatorForKind(kind) ? wanion.unidict.common.SpecificKindItemStackComparator.getComparatorFor(kind) : wanion.unidict.common.Util.itemStackComparatorByModName : wanion.unidict.common.Util.itemStackComparatorByModName;
}