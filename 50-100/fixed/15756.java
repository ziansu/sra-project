public boolean insert(int value) {
    ProtoLinkedListElement tmp = this.head;
    if (tmp != null) {
        while ((tmp.getNext()) != null)
            tmp = tmp.getNext();
        
        tmp.setNext(new ProtoLinkedListElement(value));
    }else {
        this.head = new ProtoLinkedListElement(value);
    }
    (this.size)++;
    return true;
}