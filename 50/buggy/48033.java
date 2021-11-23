@org.junit.Test
public void simpleSubTest() {
    java.lang.String vbsCode = "Public Sub Main\nEnd Sub";
    ru.zainutdinov.vbs2js.translator.Vbs2JsTranslator translator = new ru.zainutdinov.vbs2js.translator.Vbs2JsTranslator();
    java.lang.String jsCode = translator.translate(vbsCode);
    org.junit.Assert.assertEquals(jsCode, ru.zainutdinov.vbs2js.tests.Vbs2JsTranslatorTest.JS_ETALON);
}