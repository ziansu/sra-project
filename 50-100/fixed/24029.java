public java.util.List<com.lyncode.xoai.dataprovider.core.ReferenceSet> getSets(com.lyncode.xoai.dataprovider.core.XOAIContext context) {
    java.util.List<com.lyncode.xoai.dataprovider.core.ReferenceSet> list = this.item.getSets();
    for (com.lyncode.xoai.dataprovider.sets.StaticSet staticSet : context.getStaticSets()) {
        if ((staticSet.hasCondition()) && (staticSet.getCondition().getFilter().isItemShown(item))) {
            list.add(staticSet);
        }else
            if (!(staticSet.hasCondition())) {
                list.add(staticSet);
            }
        
    }
    return list;
}