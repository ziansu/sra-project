@org.junit.BeforeClass
@java.lang.SuppressWarnings(value = "unchecked")
public static void generateAndCompileEnum() throws java.lang.ClassNotFoundException {
    java.lang.ClassLoader resultsClassLoader = org.jsonschema2pojo.integration.EnumIT.classSchemaRule.generateAndCompile("/schema/enum/typeWithEnumProperty.json", "com.example", config("propertyWordDelimiters", "_"));
    org.jsonschema2pojo.integration.EnumIT.parentClass = resultsClassLoader.loadClass("com.example.TypeWithEnumProperty");
    org.jsonschema2pojo.integration.EnumIT.enumClass = ((java.lang.Class<java.lang.Enum>) (resultsClassLoader.loadClass("com.example.TypeWithEnumProperty$EnumProperty")));
}