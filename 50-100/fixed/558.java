@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(getStepId());
    dest.writeString(getStepDescription());
    dest.writeString(getStepShortDescription());
    dest.writeString(getStepVideoURL());
    dest.writeString(getStepThumbnailURL());
}