@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int parcelableFlags) {
    dest.writeLong(info.presentationTimeUs);
    dest.writeInt(info.flags);
    dest.writeByteArray(org.mozilla.gecko.media.Sample.byteArrayFromBuffer(bytes, info.offset, info.size));
    dest.writeByteArray(crypto.iv);
    dest.writeByteArray(crypto.key);
    dest.writeInt(crypto.mode);
    dest.writeIntArray(crypto.numBytesOfClearData);
    dest.writeIntArray(crypto.numBytesOfEncryptedData);
    dest.writeInt(crypto.numSubSamples);
}