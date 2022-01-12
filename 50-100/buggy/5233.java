@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeInt(weight);
    dest.writeInt(actualMod);
    dest.writeInt(maxMod);
    dest.writeString(special);
    dest.writeInt(damage);
    dest.writeInt(critic);
    dest.writeString(range);
    dest.writeParcelable(skill, 0);
}