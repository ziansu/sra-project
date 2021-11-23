@java.lang.SuppressWarnings(value = "unused")
public void readEnd(com.umeng.editor.decode.IntReader reader) throws java.io.IOException {
    super.readEnd(reader);
    int ffffx0 = reader.readInt();
    int prefix = reader.readInt();
    int uri = reader.readInt();
    if ((prefix != (mPrefix)) || (uri != (mUri))) {
        java.lang.System.out.println("Invalid end element");
    }
}