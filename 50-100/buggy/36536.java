@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(maxTemp);
    dest.writeString(minTemp);
    dest.writeString(temp);
    dest.writeString(humidity);
    dest.writeString(cloudStatus);
    dest.writeString(imageName);
    dest.writeString(name);
    dest.writeString(day);
}