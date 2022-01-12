public java.lang.String printBackwards(int numToPrint) {
    LLNode<E> item = last;
    java.lang.String finalString = "";
    for (int i = 0; i < numToPrint; i++) {
        finalString += (item.toString()) + "\n";
        item = item.getPrevious();
    }
    return finalString;
}