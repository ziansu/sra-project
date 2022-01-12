@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(mName);
    dest.writeString(mDescription);
    dest.writeString(mUrl);
    if ((mImageResourceId) != (net.alexblass.frederickcity.FrederickListItem.NO_IMAGE_PROVIDED)) {
        dest.writeInt(mImageResourceId);
    }
}