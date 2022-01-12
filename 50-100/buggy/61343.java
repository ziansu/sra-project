@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(mClassName);
    dest.writeString(mObjectId);
    dest.writeLong(mUpdatedTime);
    dest.writeLong(mCreatedTime);
    dest.writeInt((mIsDirty ? 1 : 0));
    dest.writeInt((mIsSynced ? 1 : 0));
}