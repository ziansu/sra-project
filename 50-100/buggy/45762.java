public java.lang.String toString() {
    java.lang.String retStr = "";
    DLLNode<D> iter = _front;
    while (iter != null) {
        retStr += (iter.getCargo()) + " ";
        iter = iter.getNext();
    } 
    return retStr;
}