public ReturnObject add(java.lang.Object item) {
    ReturnObject ro;
    if (item == null) {
        return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
    }else
        if ((this.next) == null) {
            (this.size)++;
            this.next = new LinkedList(item);
            ro = new ReturnObjectImpl(item);
        }else {
            ro = this.next.add(item);
            if (first)
                (this.size)++;
            
        }
    
    return ro;
}