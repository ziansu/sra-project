@org.testng.annotations.Test(enabled = false)
public void saveTarjetaCertificado() {
    java.lang.String numeroTarjeta = "1000000000000118";
    java.lang.String idUsuario = "certGT";
    long montoCertificado = 50;
    java.lang.String resultado = null;
    try {
        resultado = facade.activaTarjetaCertificado(numeroTarjeta, montoCertificado, idUsuario);
        com.claro.gml.certificados.test.BussinesTest.logger.info("resultado [{}]", resultado);
    } catch (com.claro.transfer.certificados.exception.BussinesException e) {
        com.claro.gml.certificados.test.BussinesTest.logger.error("Error [{}]", e.getMessage(), e);
    }
    com.claro.gml.certificados.test.BussinesTest.logger.info("resultado : [{}]", resultado);
}