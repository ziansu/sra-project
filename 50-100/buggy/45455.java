private void flush(java.io.DataOutputStream out) throws java.io.IOException {
    if ((this) == null)
        return ;
    
    out.writeChar(mRoot.mCharacter);
    out.writeInt(size());
    out.writeBoolean(mRoot.isTerminal);
    for (sp.TrieImpl f : mNodes) {
        f.flush(out);
    }
    out.writeChar('|');
}