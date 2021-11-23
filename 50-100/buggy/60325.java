public boolean checaTipo(loo1.plp.orientadaObjetos1.memoria.AmbienteCompilacaoOO1 ambiente) throws loo1.plp.expressions2.memory.VariavelJaDeclaradaException, loo1.plp.expressions2.memory.VariavelNaoDeclaradaException, loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseJaDeclaradaException, loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseNaoDeclaradaException, loo1.plp.orientadaObjetos1.excecao.declaracao.ProcedimentoJaDeclaradoException, loo1.plp.orientadaObjetos1.excecao.declaracao.ProcedimentoNaoDeclaradoException {
    boolean resposta;
    if (parametrosFormais.checaTipo(ambiente)) {
        ambiente.mapParametrosProcedimento(nome, parametrosFormais);
        ambiente.incrementa();
        ambiente = parametrosFormais.declaraParametro(ambiente);
        resposta = comando.checaTipo(ambiente);
        ambiente.restaura();
    }else {
        resposta = false;
    }
    return resposta;
}