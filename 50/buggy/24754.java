void println(java.lang.String input) {
    java.lang.String s = input + "q";
    byte[] array = s.getBytes(Charset.forName("UTF-8"));
    out.write(array);
    out.flush();
}