@org.junit.Test
public void testDecodificaMessaggio() {
    java.lang.System.out.println("decodificaMessaggio");
    java.lang.String expResult = "#La su io & te 4ever!";
    java.lang.String msg = cript.codificaMessaggio(expResult);
    java.lang.String result = cript.decodificaMessaggio(msg);
    assertEquals(expResult, result);
}