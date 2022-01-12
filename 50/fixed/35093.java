@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeInt(drawable);
    parcel.writeString(name);
    parcel.writeString(value);
    parcel.writeString(cashback);
    parcel.writeString(validity);
}