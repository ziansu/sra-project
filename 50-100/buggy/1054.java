@java.lang.Override
public T convert(java.lang.String value) {
    final byte[] bytes = android.util.Base64.decode(value, Base64.DEFAULT);
    android.os.Parcel parcel = android.os.Parcel.obtain();
    parcel.unmarshall(bytes, 0, bytes.length);
    parcel.setDataPosition(0);
    return mCreator.createFromParcel(parcel);
}