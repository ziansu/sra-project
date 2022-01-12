@org.junit.jupiter.api.Test
public void multiplicacoesDeConstantesSemContexto() {
    org.junit.jupiter.api.Assertions.assertEquals(2.0F, constantes(1.0F, 2.0F).valor(), 0.1);
    org.junit.jupiter.api.Assertions.assertEquals((-20.0F), constantes(1.0F, (-20.0F)).valor(), 0.1);
}