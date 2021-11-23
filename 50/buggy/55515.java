@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeValue(Nebdev);
    out.writeLong(DevId);
    out.writeValue(mBleGatt);
    out.writeValue(mDelegate);
    out.writeValue(mCtrlChar);
}