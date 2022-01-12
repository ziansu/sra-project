@java.lang.Override
public void merge(net.sharkfw.knowledgeBase.inmemory.STSet source) throws net.sharkfw.knowledgeBase.inmemory.SharkKBException {
    if (source == null) {
        return ;
    }
    if (source instanceof net.sharkfw.knowledgeBase.inmemory.InMemoPeerTaxonomy) {
        super.merge(source);
    }else {
        throw new net.sharkfw.knowledgeBase.inmemory.SharkKBException(("InMemoPeerTaxonomy can only merge " + "another InMemoTaxonomy in this version - sorry"));
    }
}