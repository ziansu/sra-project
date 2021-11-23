@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeDouble(tempKelvin);
    dest.writeString(description);
    dest.writeInt(humidity);
    dest.writeInt(pressure);
    dest.writeDouble(windSpeed);
}