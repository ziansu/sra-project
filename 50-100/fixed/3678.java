@com.sandwich.koan.Koan
public void stringCompareIgnoreCase() {
    java.lang.String str = "I AM a number ONE!";
    com.sandwich.util.Assert.assertEquals(((str.compareToIgnoreCase("I AM a number ONE!")) == 0), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(((str.compareToIgnoreCase("I am a number one!")) == 0), com.sandwich.koan.constant.KoanConstants.__);
    com.sandwich.util.Assert.assertEquals(((str.compareToIgnoreCase("I AM A NUMBER ONE!")) == 0), com.sandwich.koan.constant.KoanConstants.__);
}