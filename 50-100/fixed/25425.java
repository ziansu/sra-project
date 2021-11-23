@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeFloat(shadowTranslationZ);
    dest.writeFloat(shadowElevation);
    dest.writeByte(((byte) (affectsDisplayedPosition ? 1 : 0)));
    dest.writeByte(((byte) (forceUseCompatShadow ? 1 : 0)));
}