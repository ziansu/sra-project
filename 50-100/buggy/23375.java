@com.sandwich.koan.Koan
public void stringIsEmpty() {
    com.sandwich.util.Assert.assertEquals("".isEmpty(), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals("one".isEmpty(), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(new java.lang.String().isEmpty(), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(new java.lang.String("").isEmpty(), com.sandwich.koan.constant.KoanConstants.__);
}