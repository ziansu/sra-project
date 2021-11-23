@org.junit.Test
public void testJsonObjectEncodePrettily() {
    runJavaScript("json/JsObject", "encodePrettily");
    org.junit.Assert.assertEquals("{\"foo\":\"foo_value\"}", io.vertx.codetrans.JsonTest.o);
    runGroovy("json/JsObject", "encodePrettily");
    org.junit.Assert.assertEquals("[foo:foo_value]", io.vertx.codetrans.JsonTest.o);
    runRuby("json/JsObject", "encodePrettily");
    org.junit.Assert.assertEquals("{\"foo\":\"foo_value\"}", io.vertx.codetrans.JsonTest.o);
}