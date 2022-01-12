public java.lang.String toString() {
    java.lang.String returnString = "(" + (this.operator.toString());
    java.util.Iterator<dl.syntax.Term> subTermIterator = getSubTerms().iterator();
    while (subTermIterator.hasNext()) {
        returnString = (returnString + " ") + (subTermIterator.next().toString());
    } 
    returnString = returnString + " )";
    return returnString;
}