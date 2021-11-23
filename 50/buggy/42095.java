public void geraInvarianciaInversiva(int quantidadeRepeticoes) throws Excecoes.DadosProibidos {
    int tamanhoEntrada = numeros.size();
    if (quantidadeRepeticoes > tamanhoEntrada) {
        throw new Excecoes.DadosProibidos("Não é possível retornar este resultado.");
    }else {
        invarianciaDerivativa = Controle.GeradorInvarianciaInversiva.gerar(numeros, tamanhoEntrada);
    }
}