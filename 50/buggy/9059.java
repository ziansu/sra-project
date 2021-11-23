@java.lang.Override
public java.lang.Object visitar(br.univali.portugol.nucleo.asa.NoDeclaracaoVariavel noDeclaracaoVariavel) throws br.univali.portugol.nucleo.asa.ExcecaoVisitaASA {
    if (contemNo(noDeclaracaoVariavel, true)) {
        nosQueSeraoMantidos.add(noDeclaracaoVariavel);
    }
    return null;
}