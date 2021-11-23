@java.lang.Override
public com.mediamonkey.android.lib.dto.contents.ChapterInventory createFromParcel(final android.os.Parcel in) {
    return new com.mediamonkey.android.lib.dto.contents.ChapterInventory(in.readLong(), in.readLong(), in.readInt(), in.readString());
}