@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(mName);
    parcel.writeInt(mCurrentPage);
    parcel.writeInt(mTotalPages);
}