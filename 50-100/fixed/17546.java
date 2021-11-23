public void add(ea.raum.Raum m) {
    if (lock) {
        ea.internal.util.Logger.error("Knoten", ("Fehler: Der Knoten, an dem ein neues Objekt anzumelden war, " + "ist im Lock-Zustand."));
        return ;
    }
    if ((worldHandler) != null)
        m.updateWorld(worldHandler);
    
    list.add(m);
    java.util.Collections.sort(list);
}