@org.junit.Test
public void TestaSetTipoAnuncioInvalida() {
    try {
        anuncioAniversario.setTipoAnuncio(null);
        org.junit.Assert.fail(("Foi possível setar o tipo de anuncio do anuncio para: " + null));
    } catch (java.lang.IllegalArgumentException exception) {
        org.junit.Assert.assertEquals(java.lang.IllegalArgumentException.class, exception.getClass());
        org.junit.Assert.assertEquals(exception.getMessage(), "Argumento 'Tipo de Anúncio' recebendo valores inválidos");
    }
    org.junit.Assert.assertEquals(anuncioAniversario.getTipoAnuncio(), TipoAnuncio.ANIVERSARIO);
}