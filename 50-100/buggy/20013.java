private void writeSet(java.io.OutputStream out, java.util.Set<java.lang.String> set) throws java.io.IOException {
    if (set == null) {
        out.write(ch.ethz.tell.TellStore.toLittleEndian(0));
    }
    out.write(ch.ethz.tell.TellStore.toLittleEndian(set.size()));
    for (java.lang.String str : set) {
        writeString(out, str);
    }
}