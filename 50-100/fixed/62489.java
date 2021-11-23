private com.esotericsoftware.yamlbeans.YamlReaderTest.Test read(java.lang.String yaml) throws java.lang.Exception {
    if (true) {
        java.lang.System.out.println(yaml);
        java.lang.System.out.println("===");
        java.lang.System.out.println(new com.esotericsoftware.yamlbeans.YamlReader(yaml).read());
        java.lang.System.out.println();
        java.lang.System.out.println();
    }
    return new com.esotericsoftware.yamlbeans.YamlReader(yaml).read(com.esotericsoftware.yamlbeans.YamlReaderTest.Test.class);
}