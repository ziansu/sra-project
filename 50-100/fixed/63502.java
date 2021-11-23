private boolean isKeyword(java.util.Queue<java.lang.String> ignore, java.lang.String word) {
    java.lang.Boolean keyword = true;
    java.util.Queue<java.lang.String> Q = new java.util.LinkedList<java.lang.String>(ignore);
    while (!(Q.isEmpty())) {
        if (Q.poll().toUpperCase().equals(word.toUpperCase())) {
            keyword = false;
        }
    } 
    return keyword;
}