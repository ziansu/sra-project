void println(java.lang.String input) throws java.io.IOException {
    java.lang.String s = input + "q";
    byte[] array = s.getBytes();
    out.write(array);
    out.flush();
}