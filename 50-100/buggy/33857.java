private com.example.shoha.avalon.Charecter pickCharecter() {
    java.util.Random r = new java.util.Random(java.lang.System.nanoTime());
    int index = r.nextInt(charecters.size());
    com.example.shoha.avalon.Charecter c = charecters.get(index);
    charecters.remove(index);
    return c;
}