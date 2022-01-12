public void geraInvarianciaInversiva(int quantidadeRepeticoes) throws Excecoes.DadosProibidos {
    if (quantidadeRepeticoes > (numeros.size())) {
        throw new Excecoes.DadosProibidos("Não é possível retornar este resultado.");
    }else {
        invarianciaDerivativa = Controle.GeradorInvarianciaInversiva.gerar(numeros, quantidadeRepeticoes);
    }
}