@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeDouble(tempKelvin);
    dest.writeString(description);
    dest.writeInt(humidity);
    dest.writeDouble(pressure);
    dest.writeDouble(windSpeed);
}