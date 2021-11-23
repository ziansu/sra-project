public java.lang.String toString() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    if ((L) != null) {
        L.moveFront();
        while ((L.index()) != (-1)) {
            C = ((HSCardList.Card) (L.get()));
            sb.append(C.toString);
            sb.append("\n");
            L.moveNext();
        } 
    }
    return new java.lang.String(sb);
}