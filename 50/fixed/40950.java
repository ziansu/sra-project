@java.lang.Override
public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    super.writeExternal(out);
    out.writeObject(mNickname);
    out.writeLong(mUserId);
}