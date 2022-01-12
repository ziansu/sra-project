@org.junit.Test
public void TestaSetTipoAnuncioInvalida() {
    models.TipoAnuncio tipoAnuncioInvalido = null;
    try {
        anuncioAniversario.setTipoAnuncio(tipoAnuncioInvalido);
        org.junit.Assert.fail(("Foi possível setar o tipo de anuncio do anuncio para: " + tipoAnuncioInvalido));
    } catch (java.lang.IllegalArgumentException exception) {
        org.junit.Assert.assertEquals(java.lang.IllegalArgumentException.class, exception.getClass());
        org.junit.Assert.assertEquals(exception.getMessage(), "Argumento 'Tipo de Anúncio' recebendo valores inválidos");
    }
    org.junit.Assert.assertEquals(anuncioAniversario.getTipoAnuncio(), TipoAnuncio.ANIVERSARIO);
}