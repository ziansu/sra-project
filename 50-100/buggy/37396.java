@java.lang.Override
public void deserialize(java.io.InputStream in) throws java.io.IOException {
    mNodes.clear();
    java.io.DataInputStream is = new java.io.DataInputStream(in);
    mRoot.mCharacter = is.readChar();
    mSize = is.readInt();
    mRoot.isTerminal = is.readBoolean();
    while ((is.available()) != 0) {
        restore(is);
    } 
}