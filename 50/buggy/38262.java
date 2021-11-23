@org.junit.Test
public void testcpfInserido() throws java.lang.Exception {
    assertTrue(projetomercado.GerenciadorClientes.cpfInserido("12647527504"));
    assertFalse(projetomercado.GerenciadorClientes.cpfInserido("49762871650"));
}