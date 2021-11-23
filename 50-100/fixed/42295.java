void save(java.io.DataOutputStream out) throws java.io.IOException {
    out.writeInt(tingID);
    if ((mp3) == null) {
        out.writeUTF("");
    }else {
        out.writeUTF(mp3.getName());
    }
    if ((script) == null) {
        tingeltangel.core.Entry.writeLongUTF(out, "");
    }else {
        tingeltangel.core.Entry.writeLongUTF(out, script.toString());
    }
    out.writeInt(type);
    out.writeUTF(hint);
}