@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(getObjectId());
    parcel.writeParcelable(getCategory(), i);
    parcel.writeString(getDetails());
    parcel.writeInt(getDuration());
    parcel.writeString(getLocations().toString());
    parcel.writeValue(getStartTime());
    parcel.writeString(getTitle());
    parcel.writeParcelable(getHost(), i);
}