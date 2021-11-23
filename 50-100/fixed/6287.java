@org.junit.Test
public void validateSingleLine() {
    java.lang.String data = "Be not afraid of greatness:";
    java.io.ByteArrayInputStream is = new java.io.ByteArrayInputStream(data.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    org.apache.nifi.processors.kafka.StreamTokenizer scanner = new org.apache.nifi.processors.kafka.StreamTokenizer(is);
    assertTrue(java.util.Arrays.equals("Be not afraid of greatness:\n".getBytes(java.nio.charset.StandardCharsets.UTF_8), scanner.nextToken()));
    assertNull(scanner.nextToken());
}