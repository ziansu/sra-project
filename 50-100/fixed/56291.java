@org.junit.Test
public void testEscolhaCodigoCorreto() {
    try {
        br.univali.portugol.nucleo.Portugol.compilarParaAnalise(("programa {" + (((((((((((" funcao inicio() {" + "  inteiro a = 1") + "  escolha (a) {") + "     caso 2:") + "         pare") + "     caso 1:") + "         pare") + "     caso contrario:") + "         pare") + "  }") + " }") + "}")));
    } catch (br.univali.portugol.nucleo.ErroCompilacao erroCompilacao) {
        assertEquals("Nao era esperado um erro semantico", 0, erroCompilacao.getResultadoAnalise().getErros().size());
    }
}