@com.sandwich.koan.Koan
public void stringCompare() {
    java.lang.String str = "I AM a number ONE!";
    com.sandwich.util.Assert.assertEquals(str.compareTo("I AM a number ONE!"), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(str.compareTo("I am a number one!"), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(str.compareTo("I AM A NUMBER ONE!"), com.sandwich.koan.constant.KoanConstants.__);
}