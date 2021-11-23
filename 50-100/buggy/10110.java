public java.lang.String printForwards(int numToPrint) {
    LLNode<E> item = first;
    java.lang.String finalString = "";
    for (int i = 0; i < numToPrint; i++) {
        finalString += (item.toString()) + "\n";
        item = item.getNext();
    }
    return finalString;
}