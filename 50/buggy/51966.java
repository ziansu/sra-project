public lovera.kualpostinvou.modelos.Localizacao getLocalizacao() throws java.lang.Exception {
    if (temLastLocation())
        return this.localizacao;
    
    forceLocationRequest();
    if (temLastLocation())
        return this.localizacao;
    
    throw new java.lang.Exception();
}