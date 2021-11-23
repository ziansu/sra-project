@java.lang.Override
public void readExternal(java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
    super.readExternal(in);
    mRegionId = in.readLong();
    mUserId = in.readLong();
}