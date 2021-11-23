@org.junit.Test
public void testXmlToResult() throws javax.xml.bind.JAXBException {
    java.lang.String testXml = "<?xml version=\"1.0\" ?><wordsegmentation version=\"0.1\">" + ((("<processstatus code=\"0\">Success</processstatus><result><sentence>" + "#1:1.[0] S(NP(N:台新|Head:N:金控)|Nd:１２月３日|ADV:將|Head:Vt:召開|") + "NP(N:股東|Head:N:臨時會)|VP(Head:Vt:進行|NP(NP(Head:N:董監)|Head:Nv:改選)))") + "#。(PERIODCATEGORY)</sentence></result></wordsegmentation>");
    tw.com.mt.ckipparser.ParserResult result = tw.com.mt.ckipparser.ParserUtil.xmlToResult(testXml);
    assertNotNull(result);
    assertEquals("Success", result.getProcessStatus());
    assertEquals(0, result.getStatusCode());
    assertTrue(result.getSentence()[0].matches("^#1:1.*PERIODCATEGORY\\)$"));
}