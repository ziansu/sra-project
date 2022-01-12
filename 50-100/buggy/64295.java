public int ilPiuPovero() {
    int posizione = 0;
    for (int i = 0; i < (elencoGiocatori.size()); i++)
        for (int j = 0; j < (elencoGiocatori.size()); j++)
            if (elencoGiocatori.get(i).piuPovero(elencoGiocatori.get(j)))
                posizione = i;
            
        
    
    return posizione;
}