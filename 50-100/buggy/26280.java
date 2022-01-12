@java.lang.SuppressWarnings(value = "unused")
public void readEnd(com.umeng.editor.decode.IntReader reader) throws java.io.IOException {
    super.readEnd(reader);
    int ffffx0 = reader.readInt();
    int prefix = reader.readInt();
    int uri = reader.readInt();
    if ((prefix != (mPrefix)) || (uri != (mUri))) {
        throw new java.io.IOException("Invalid end element");
    }
}