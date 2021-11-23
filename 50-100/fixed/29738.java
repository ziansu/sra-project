@org.junit.Test
public void testComputeSpecifiedArgPart1Arg() {
    java.lang.System.out.println("computeSpecifiedArgPart");
    java.lang.String[] keys = new java.lang.String[]{ "a" };
    java.util.List<java.lang.String> jsonArgs = java.util.Arrays.asList("5");
    java.util.List<java.lang.String> paramNames = java.util.Arrays.asList("a");
    doReturn("5").when(instance).processArg(any(java.lang.String[].class), anyString());
    java.lang.String result = instance.computeSpecifiedArgPart(keys, jsonArgs, paramNames);
    assertThat(result).isEqualTo("[5]");
}