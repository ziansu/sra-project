@org.junit.Test
public void testAfficheErreur() {
    java.lang.System.out.println("afficheErreur");
    puissance4.bean.Validation.validationPseudo("toto");
    puissance4.bean.Validation.validationIp("127.0.0.1");
    puissance4.bean.Validation.validationPort("4200");
    puissance4.bean.Validation.afficheErreur();
    assertTrue(puissance4.bean.Validation.afficheErreur().isEmpty());
}