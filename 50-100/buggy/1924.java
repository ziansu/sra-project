public void removeEdge(edmonds.karp.Node adjacent) {
    if ((sizeEdge) == 0) {
        java.lang.System.out.println("Rimozione fallita: non sono presenti archi");
    }
    edmonds.karp.Edge tmp = header;
    for (int i = 0; i < ((sizeEdge) - 1); i++) {
        if ((tmp.getNext().getNodeB()) == adjacent)
            tmp.setNext(tmp.getNext().getNext());
        
        tmp = tmp.getNext();
    }
    (sizeEdge)--;
}