@org.junit.Test
public void testCodificaMessaggio() {
    java.lang.System.out.println("codifica Messaggio");
    java.lang.String msg = "#La su io & te 4ever!";
    java.lang.String result = cript.codificaMessaggio(msg);
    assertNotEquals(msg, result);
}