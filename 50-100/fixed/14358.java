public static void main(java.lang.String[] args) {
    com.FooParser fp = new com.FooParser(new java.io.StringBufferInputStream(com.FooParser.TEST_DATA));
    try {
        fp.routine();
    } catch (com.ParseException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("accept");
}