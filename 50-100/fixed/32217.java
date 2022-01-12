public io.github.cccm5.MerchantItem getSourceItem() {
    if ((((((this.sourceItem) == null) && ((itemStackPersist) != null)) && ((baseCostPersist) != null)) && ((growthPersist) != null)) && ((this.defaultPersist) != null)) {
        this.setSourceItem(new io.github.cccm5.MerchantItem(itemStackPersist, baseCostPersist, growthPersist, this.npc, defaultPersist));
    }
    return this.sourceItem;
}