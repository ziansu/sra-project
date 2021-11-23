public static void irPara(com.example.test.UniritterContexto pContext) {
    com.example.test.ContatoPagina.contexto = pContext;
    com.example.test.ContatoPagina.contexto.driver.get(com.example.test.ContatoPagina.contexto.baseUrl);
}