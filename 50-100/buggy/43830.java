@org.junit.Test
public void firstTest() {
    java.lang.String line = "";
    assertEquals(0, ((2 + (line.length())) - (day8.count(line))));
    line = "aqttwnsohbzian\"evtllfxwkog\"cunzw";
    byte[] bytes = line.getBytes();
    java.lang.System.out.println(("bytes: " + (bytes.length)));
    assertEquals(32, ((2 + (line.length())) - (day8.count(line))));
}