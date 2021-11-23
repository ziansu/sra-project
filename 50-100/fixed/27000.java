public void eseguiEffettoMercato(LorenzoIlMagnifico.Giocatore giocatore, int posizione) {
    if (posizione == 0)
        giocatore.getRisorse().cambiaMonete(5);
    else
        if (posizione == 1)
            giocatore.getRisorse().cambiaServitori(5);
        else
            if (posizione == 2) {
                giocatore.getRisorse().cambiaMonete(2);
                giocatore.getPunti().cambiaPuntiMilitari(3);
            }else
                if (posizione == 3) {
                }
            
        
    
}