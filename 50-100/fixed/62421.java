public void pagaServitore(main.model.Famigliare famigliare, int valore) throws main.model.exceptions.NoEnoughResourcesException {
    int servitoriDaPagare = valore;
    if ((this.scomuniche[1]) != null)
        if (this.scomuniche[1].attivaOnPagaServitore())
            servitoriDaPagare = servitoriDaPagare * 2;
        
    
    if ((this.risorse.getServitori()) < servitoriDaPagare)
        throw new main.model.exceptions.NoEnoughResourcesException();
    else {
        this.risorse.cambiaServitori((-servitoriDaPagare));
        famigliare.cambiaValore(valore);
    }
}