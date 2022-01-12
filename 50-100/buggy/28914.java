@org.junit.Test
public void testGenerateNextValue() throws java.lang.Exception {
    for (int j = 1; j <= 10; j++) {
        int value = ((time) * j) - (1 + ((int) (2 * (java.lang.Math.random()))));
        java.lang.System.out.println(java.lang.String.format("%s : %s vs %s", value, (j * (time)), fieldValueGenerator.generateNextValue(value)));
        assertEquals((j * (time)), fieldValueGenerator.generateNextValue(value));
    }
}