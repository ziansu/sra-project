public java.lang.String printForwards(int numToPrint) {
    LLNode<E> item = first;
    java.lang.String finalString = "";
    if ((size()) == 0)
        return finalString;
    
    for (int i = 0; i < numToPrint; i++) {
        finalString += (item.toString()) + "\n";
        item = item.getNext();
    }
    return finalString;
}