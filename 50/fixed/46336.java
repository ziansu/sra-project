@org.junit.Test
public void setsVariableBeforeTryCatch() {
    int a = 23;
    try {
        a = java.lang.Integer.parseInt("not a number");
    } catch (java.lang.NumberFormatException e) {
    }
    assertEquals(23, a);
}