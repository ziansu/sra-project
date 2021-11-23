@java.lang.Override
public void print(final java.lang.String str) {
    realPrintStream.print(str);
    newOutputStream.println(str);
}