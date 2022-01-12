@java.lang.Override
public void WriteLine(java.lang.String[] data) throws java.io.IOException {
    java.io.PrintStream writer = new java.io.PrintStream(file);
    writer.println(((java.util.Arrays.stream(data).collect(java.util.stream.Collectors.joining(","))) + ";"));
    writer.flush();
    writer.close();
}