public void removeNodeBeforePosition(java.lang.Object position) {
    if (data_structures.BinomialHeap.HeapNodeLinkedList.HeapNodeLinkedListNode.class.isInstance(position)) {
        data_structures.BinomialHeap.HeapNodeLinkedList.HeapNodeLinkedListNode positionNode = ((data_structures.BinomialHeap.HeapNodeLinkedList.HeapNodeLinkedListNode) (position));
        data_structures.BinomialHeap.HeapNodeLinkedList.HeapNodeLinkedListNode nodeToRemove = positionNode.mPrev;
        if ((this.mRoot) == nodeToRemove) {
            this.mRoot = positionNode;
            positionNode.mPrev = null;
            return ;
        }
        nodeToRemove.mPrev.mNext = positionNode;
        positionNode.mPrev = nodeToRemove.mPrev;
    }
}