public int getAridadeRequerido() {
    int aridadeRequerido = 0;
    loo1.plp.orientadaObjetos1.declaracao.procedimento.ListaDeclaracaoParametro listaParametrosAtual = parametrosFormais;
    while (listaParametrosAtual != null) {
        loo1.plp.orientadaObjetos1.declaracao.procedimento.Parametro parametroAtual = listaParametrosAtual.getHead().getParametro();
        if (parametroAtual instanceof loo1.plp.orientadaObjetos1.declaracao.procedimento.ParametroRequerido) {
            aridadeRequerido++;
        }
        listaParametrosAtual = ((loo1.plp.orientadaObjetos1.declaracao.procedimento.ListaDeclaracaoParametro) (listaParametrosAtual.getTail()));
    } 
    return aridadeRequerido;
}