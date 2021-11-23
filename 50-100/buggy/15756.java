public boolean insert(int value) {
    ProtoLinkedListElement tmp = this.head;
    while ((tmp.getNext()) != null)
        tmp = tmp.getNext();
    
    tmp.setNext(new ProtoLinkedListElement(java.lang.Integer.valueOf(value)));
    (this.size)++;
    return true;
}