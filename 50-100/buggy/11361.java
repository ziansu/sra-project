public java.lang.String toString() {
    java.lang.String returnString = "(" + (this.operator.todRealString());
    java.util.Iterator<dl.syntax.Term> subTermIterator = getSubTerms().iterator();
    while (subTermIterator.hasNext()) {
        returnString = (returnString + " ") + (subTermIterator.next().todRealString());
    } 
    returnString = returnString + " )";
    return returnString;
}