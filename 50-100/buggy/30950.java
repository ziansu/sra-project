public static java.util.LinkedList<BCP> carregaBCP(java.util.LinkedList<Processo> p) {
    java.util.LinkedList<BCP> listaBCP = new java.util.LinkedList<BCP>();
    java.util.Iterator<Processo> it = p.iterator();
    while (it.hasNext())
        listaBCP.add(new BCP(it.next()));
    
    return listaBCP;
}