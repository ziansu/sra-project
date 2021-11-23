private static void checkSecretFunction() throws java.lang.IllegalArgumentException {
    short x = ((short) ((java.lang.Math.random()) * 10));
    java.lang.System.out.println((("Enter secret answer (request = " + x) + " ) "));
    int secretValue = Application.scanSecretFunction();
    Application.checkSecretAnswer(x, secretValue);
}