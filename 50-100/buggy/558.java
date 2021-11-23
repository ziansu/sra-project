@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(getStepId());
    dest.writeString(getStepShortDescription());
    dest.writeString(getStepDescription());
    dest.writeString(getStepVideoURL());
    dest.writeString(getStepThumbnailURL());
}