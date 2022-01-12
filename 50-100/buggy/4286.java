@java.lang.Override
public int nextDoc() throws java.io.IOException {
    alreadyAtFirstMatch = false;
    if (((producerDoc) == (NO_MORE_DOCS)) || ((filterDoc) == (NO_MORE_DOCS)))
        return NO_MORE_DOCS;
    
    producerDoc = producer.nextDoc();
    producerStart = -1;
    if ((producerDoc) == (NO_MORE_DOCS))
        return NO_MORE_DOCS;
    
    return findDocWithMatch();
}