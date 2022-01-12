@java.lang.Override
public java.lang.String convert(android.os.Parcelable value) {
    android.os.Parcel parcel = android.os.Parcel.obtain();
    value.writeToParcel(parcel, 0);
    final byte[] marshall = parcel.marshall();
    parcel.recycle();
    return android.util.Base64.encodeToString(marshall, Base64.DEFAULT);
}