@org.junit.Test
public void QuandoAdicionaItemNaNotaFiscalItemEhAdicionadoNaListaDaNotaFiscal() {
    org.mockito.Mockito.when(fiscalizador.validaCPF(cpf)).thenReturn(true);
    notaFiscal.NotaFiscal testeNotaFiscal = new notaFiscal.NotaFiscal(casd, cpf, item, quant);
    testeNotaFiscal.adicionaItem(livro, quant);
    assertTrue(((testeNotaFiscal.getItem(livro)) == (quant)));
    assertTrue(((testeNotaFiscal.getItem(item)) == (quant)));
    assertTrue(((testeNotaFiscal.getItem(caneta)) == 0));
}