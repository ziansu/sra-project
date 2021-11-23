@java.lang.Override
public void merge(net.sharkfw.knowledgeBase.STSet toMerge) throws net.sharkfw.knowledgeBase.SharkKBException {
    if (toMerge instanceof net.sharkfw.knowledgeBase.inmemory.InMemoTaxonomy) {
        net.sharkfw.knowledgeBase.TaxonomyWrapper imt = ((net.sharkfw.knowledgeBase.TaxonomyWrapper) (toMerge));
        net.sharkfw.knowledgeBase.SemanticNet storage2Merge = imt.getStorage();
        this.sn.merge(storage2Merge);
    }else {
        this.sn.merge(toMerge);
    }
}