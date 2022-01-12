@java.lang.Override
public void WriteLine(java.lang.String[] data) throws java.io.IOException {
    java.io.PrintStream writer = new java.io.PrintStream(new java.io.FileOutputStream(file, true));
    writer.append(java.util.Arrays.stream(data).collect(java.util.stream.Collectors.joining(","))).append(";");
    writer.println();
    writer.close();
}