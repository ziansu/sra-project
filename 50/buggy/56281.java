@java.lang.Override
public void join(ViewProxy proxy, java.lang.String session) throws java.io.IOException {
    java.lang.System.out.println((("Writting J and the " + session) + " <Byte> <UTF>"));
    out.writeByte('J');
    out.writeUTF(session);
}