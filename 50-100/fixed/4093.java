@org.junit.Test
public void QuandoPedeValorTotalParaNotaFiscalRetornaSomaDosPrecosDeCadaItemMultiplicadoPelasQuantidades() {
    org.mockito.Mockito.when(fiscalizador.validaCPF(cpf)).thenReturn(true);
    notaFiscal.NotaFiscal testeNotaFiscal = new notaFiscal.NotaFiscal(casd, cpf, item, quant);
    testeNotaFiscal.adicionaItem(item, quant);
    testeNotaFiscal.adicionaItem(notebook, quant);
    testeNotaFiscal.adicionaItem(caneta, quant);
    assertTrue(((testeNotaFiscal.ValorTotal()) == 40));
}