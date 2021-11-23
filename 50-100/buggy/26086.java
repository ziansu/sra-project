@org.junit.Test
public void QuandoAdicionaItemNaNotaFiscalItemEhAdicionadoNaListaDaNotaFiscal() {
    org.mockito.Mockito.when(fiscalizador.validaCPF(cpf)).thenReturn(true);
    notaFiscal.NotaFiscal testeNotaFiscal = new notaFiscal.NotaFiscal(casd, cpf, item, quant);
    testeNotaFiscal.adicionaItem(livro, quant);
    assertTrue(((notaFiscal.NotaFiscal.getItem(livro)) == (quant)));
    assertTrue(((notaFiscal.NotaFiscal.getItem(item)) == (quant)));
    assertTrue(((notaFiscal.NotaFiscal.getItem(caneta)) == 0));
}