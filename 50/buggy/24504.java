@com.example.test.Test
public void testUniritterContatoValidacaoParcial() throws java.lang.Exception {
    com.example.test.ContatoPagina.irPara(uniritterContexto);
    com.example.test.ContatoPagina.preencherParcialmenteCamposFormulario();
    com.example.test.ContatoPagina.enviarContatoPreenchido();
    com.example.test.ContatoPagina.validaRetornoErroParcial();
}