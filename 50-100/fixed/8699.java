@org.junit.Test
public void testValidarCampos() {
    java.lang.System.out.println("validarCampos");
    java.lang.String username = "";
    java.lang.String password = "";
    com.grupo7.practica.principal instance = new com.grupo7.practica.principal();
    boolean expResult = false;
    boolean result = instance.validarCampos(username, password);
    assertEquals(expResult, result);
}