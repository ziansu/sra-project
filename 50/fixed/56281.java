@java.lang.Override
public void join(ViewProxy proxy, java.lang.String session) throws java.io.IOException {
    out.writeByte('J');
    out.writeUTF(session);
}